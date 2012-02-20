package org.apache.cassandra.auth;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import org.apache.cassandra.thrift.CassandraServer;
import org.apache.cassandra.thrift.ColumnOrSuperColumn;
import org.apache.cassandra.thrift.ColumnPath;
import org.apache.cassandra.thrift.ConsistencyLevel;
import org.apache.cassandra.thrift.InvalidRequestException;
import org.apache.cassandra.thrift.NotFoundException;
import org.apache.cassandra.thrift.TimedOutException;
import org.apache.cassandra.thrift.UnavailableException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Evaluator {

    private static Logger logger = LoggerFactory.getLogger(Evaluator.class);

    protected static boolean evaluate(ByteBuffer key, AuthenticatedUser user,
        Node whereNode, CassandraServer server) {
        boolean result = false;

        NodeList whereNodeChildren = whereNode.getChildNodes();
        for (int k = 0; k < whereNodeChildren.getLength(); k++) {
            Node n = whereNodeChildren.item(k);
            if (n.getNodeName().equals("in")) {
                result = evaluate_in(key, user, n, server);
            }
            if (n.getNodeName().equals("equal")) {
                result = evaluate_equal(key, user, n, server);
            }
            if (n.getNodeName().equals("and")) {
                result = evaluate_and(key, user, n, server);
            }
        }
        return result;
    }

    protected static boolean evaluate_in(ByteBuffer key,
        AuthenticatedUser user, Node inNode, CassandraServer server) {
        boolean result = false;

        Node lhsNode, rhsNode;

        lhsNode = XMLHelper.getChildNodeByName(inNode, "op1");
        rhsNode = XMLHelper.getChildNodeByName(inNode, "op2");

        if (lhsNode != null && rhsNode != null) {
            String lhs = lhsNode.getTextContent().trim();
            String rhs = rhsNode.getTextContent().trim();

            String lhsResult = evaluate(key, user, lhs, server);
            String rhsResult = evaluate(key, user, rhs, server);

            if (rhs.equals("CURRENT_TIME")) {
                DateFormat dateFormat = new SimpleDateFormat(
                    "yyyy/MM/dd HH:mm:ss");
                Date date = new Date();
                int i = compareDates(dateFormat.format(date), lhs);
                if (i == 1)
                    return true;
                else
                    return false;
            }
            return (rhsResult.contains(lhsResult));
        }
        return result;
    }

    protected static boolean evaluate_equal(ByteBuffer key,
        AuthenticatedUser user, Node andNode, CassandraServer server) {
        boolean result = false;

        Node lhsNode, rhsNode;

        lhsNode = XMLHelper.getChildNodeByName(andNode, "op1");
        rhsNode = XMLHelper.getChildNodeByName(andNode, "op2");

        if (lhsNode != null && rhsNode != null) {
            String lhs = lhsNode.getTextContent().trim();
            String rhs = rhsNode.getTextContent().trim();

            String lhsResult = evaluate(key, user, lhs, server);
            String rhsResult = evaluate(key, user, rhs, server);

            return (rhsResult.equals(lhsResult));
        }
        return result;
    }

    protected static boolean evaluate_and(ByteBuffer key,
        AuthenticatedUser user, Node andNode, CassandraServer server) {
        boolean result = true;
        NodeList children = andNode.getChildNodes();
        for (int k = 0; k < children.getLength(); k++) {
            Node n = children.item(k);
            if (n.getNodeName().equals("in")) {
                result = result && evaluate_in(key, user, n, server);
            }
            if (n.getNodeName().equals("equal")) {
                result = result && evaluate_equal(key, user, n, server);
            }
        }
        return result;
    }

    protected static int compareDates(String inputDate, String dateRange) {
        String[] dateEndPoints = dateRange.split("-");
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        try {
            Date date = dateFormat.parse(inputDate);
            Date leftEndPoint = dateFormat.parse(dateEndPoints[0]);
            Date rightEndPoint = dateFormat.parse(dateEndPoints[1]);
            if (date.after(leftEndPoint) && date.before(rightEndPoint)) {
                return 1;
            } else {
                return 0;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private static String evaluate(ByteBuffer key, AuthenticatedUser user,
        String expr, CassandraServer server) {
        String answer = null;

        String columnFamily = parseColumnFamily(expr);
        String column = parseColumn(expr);
        ByteBuffer queryKey = parseKey(key, user, expr, server);

        ColumnPath accessorColPath = new ColumnPath();
        accessorColPath.setColumn_family(columnFamily);
        accessorColPath.setColumn(column.getBytes());

        try {
            ConsistencyLevel consistency_level = ConsistencyLevel
                .findByValue(1);

            ColumnOrSuperColumn accessorsSpecificColumn;

            accessorsSpecificColumn = server.get(queryKey, accessorColPath,
                consistency_level);
            String accessorColValue = KVACUtil
                .getStringRepresentation(accessorsSpecificColumn.getColumn()
                    .bufferForValue());

            logger.info(" -- KVAC --- Accessor column value:"
                + accessorColValue);
            answer = accessorColValue;
        } catch (NotFoundException e) {
            e.printStackTrace();
        } catch (InvalidRequestException e) {
            e.printStackTrace();
        } catch (UnavailableException e) {
            e.printStackTrace();
        } catch (TimedOutException e) {
            e.printStackTrace();
        }

        return answer;
    }

    protected static String parseColumnFamily(String expression) {
        // input = /PatientInfoSystem/Patient(key=thisKey)/name
        // output = "Patient"
        String columnFamily = null;
        StringTokenizer tokenizer = new StringTokenizer(expression, "/");
        int count = 0;
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (count == 1) {
                int index = token.indexOf("(");
                columnFamily = token.substring(0, index > 0 ? index : token
                    .length());
                break;
            } else {
                count++;
            }
        }
        return columnFamily;
    }

    protected static String parseColumn(String expression) {
        // input = /PatientInfoSystem/Patient(key=thisKey)/name
        // output = "name"
        String column = null;
        StringTokenizer tokenizer = new StringTokenizer(expression, "/");
        int count = 0;
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (count == 2) {
                int index = token.indexOf("(");
                column = token.substring(0, index > 0 ? index : token.length());
                break;
            } else {
                count++;
            }
        }
        return column;
    }

    protected static ByteBuffer parseKey(ByteBuffer inputKey,
        AuthenticatedUser user, String expression, CassandraServer server) {
        // 1) input = /PatientInfoSystem/Patient(key=thisKey)/name
        // output = inputKey
        // 2) input = /PatientInfoSystem/Doctor(key=user.name)/curr_patients
        // output = key constructed from user's username
        // 3) input = /PatientInfoSystem/Doctor(key=/PatientInfoSystem/Patient(key=thisKey)/curr_doctor)/location
        // output = key corresponding to the name of "curr_doctor" for inputKey
        int start = expression.indexOf("(");
        int end = expression.lastIndexOf(")");
        String keyVal = expression.substring(start + 1, end);
        if (keyVal.equals("key=thisKey")) {
            return inputKey;
        } else if (keyVal.equals("key=user.name")) {
            String keyName = user.username;
            ByteBuffer keyOfAccessor = getKey(keyName);
            return keyOfAccessor;
        } else {
            keyVal = keyVal.substring(keyVal.indexOf("/"));
            String keyString = evaluate(inputKey, user, keyVal, server);
            ByteBuffer keyOfAccessor = getKey(keyString);
            return keyOfAccessor;
        }

    }

    private static ByteBuffer getKey(String keyName) {
        byte[] keyNameArray = keyName.getBytes(Charset.forName("ISO-8859-1"));
        ByteBuffer keyOfAccessor = ByteBuffer.wrap(keyNameArray);
        return keyOfAccessor;
    }

    private static String evaluate_poc(ByteBuffer key, AuthenticatedUser user,
        String expr, CassandraServer server) {
        String answer = null;

        // 2.1 Create the key
        ByteBuffer keyOfAccessor = ByteBuffer.allocate(6);
        String t1 = "jsmith";
        byte[] t1array = t1.getBytes(Charset.forName("ISO-8859-1"));
        keyOfAccessor = ByteBuffer.wrap(t1array);

        String temp = KVACUtil.getStringRepresentation(keyOfAccessor);

        // 2.2 Create the ColumnPath
        ColumnPath accessorColPath = new ColumnPath();
        accessorColPath.setColumn_family("Doctor");
        accessorColPath.setColumn("curr_patients".getBytes());

        // 2.3 Query the accessor's Column Family
        try {
            ConsistencyLevel consistency_level = ConsistencyLevel
                .findByValue(1);

            ColumnOrSuperColumn accessorsSpecificColumn;
            try {
                accessorsSpecificColumn = server.get(keyOfAccessor,
                    accessorColPath, consistency_level);
                String accessorColValue = KVACUtil
                    .getStringRepresentation(accessorsSpecificColumn
                        .getColumn().bufferForValue());

                logger.info(" -- KVAC --- Accessor column value:"
                    + accessorColValue);
                answer = accessorColValue;
            } catch (InvalidRequestException e) {
                e.printStackTrace();
            } catch (UnavailableException e) {
                e.printStackTrace();
            } catch (TimedOutException e) {
                e.printStackTrace();
            }
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

        return answer;
    }
}
