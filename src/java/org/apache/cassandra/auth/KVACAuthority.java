package org.apache.cassandra.auth;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.cassandra.config.ConfigurationException;
import org.apache.cassandra.thrift.CassandraServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class KVACAuthority implements IAuthority {

    private static Logger logger = LoggerFactory.getLogger(KVACAuthority.class);

    public final static String ACCESS_FILENAME_PROPERTY = "access.properties";
    Map<String, Node> resourcePolicyMap = readPolicyFile();
    Map<Long, Long> threadIdInvocationCount = new LinkedHashMap<Long, Long>();

    // private Map<Node, Node> resourcePolicyMap;

    public EnumSet<Permission> authorize(AuthenticatedUser user,
        List<Object> resource) {
        return EnumSet.of(Permission.READ);
    }

    public void validateConfiguration() throws ConfigurationException {
        // pass
    }

    @Override
    public EnumSet<Permission> authorize(ByteBuffer key,
        AuthenticatedUser user, List<Object> resourceList,
        CassandraServer server) {
        
        //logger.info("Evaluating authorization decision inside KVACAuthority");

        long threadId = Thread.currentThread().getId();
        // System.out.println("Thread ID:" + threadId);

        // We are returning back as part of an ongoing authorize invocation.
        if (threadIdInvocationCount.containsKey(threadId)) {
            return Permission.ALL;
        } else {
            threadIdInvocationCount.put(threadId, threadId);
        }

        /*
        if (resourcePolicyMap == null) {
            try {
                readPolicyFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } */

        String resource = "";
        for (int i = 0; i < resourceList.size(); i++) {
            resource += "/" + resourceList.get(i);
        }

        // System.out.println("Resource:" + resource);
        Node whereNode = resourcePolicyMap.get(resource);

        boolean result = Evaluator.evaluate(key, user, whereNode, server);
        threadIdInvocationCount.remove(threadId);

        if (result) {
            return EnumSet.of(Permission.READ);
        }

        return Permission.NONE;
    }

    public Map<String, Node> getPolicyMap() throws Exception {
        return resourcePolicyMap;
    }

    public Map<String,Node> readPolicyFile() {
        Map<String,Node>resourcePolicyMap = new LinkedHashMap<String, Node>();
        String accessFilename = System.getProperty(ACCESS_FILENAME_PROPERTY);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document dom = db.parse(accessFilename);
            NodeList policyList = dom.getElementsByTagName("policy");
            String resource = null;
            Node policy = null;
            for (int i = 0; i < policyList.getLength(); i++) {
                Node policyNode = policyList.item(i);
                NodeList children = policyNode.getChildNodes();
                for (int j = 0; j < children.getLength(); j++) {
                    Node child = children.item(j);
                    if (child.getNodeName().equals("access")) {
                        resource = child.getTextContent();
                        resource = resource.replaceAll(" ", "").replaceAll(
                            "\n", "");

                    }
                    if (child.getNodeName().equals("where")) {
                        policy = child;
                    }
                    if (resource != null && policy != null) {
                        resourcePolicyMap.put(resource, policy);
                        resource = null;
                        policy = null;
                    }
                }
            }

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (SAXException se) {
            se.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return resourcePolicyMap;
    }
}