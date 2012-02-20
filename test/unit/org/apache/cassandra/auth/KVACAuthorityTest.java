package org.apache.cassandra.auth;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.cassandra.config.DatabaseDescriptor;
import org.apache.cassandra.thrift.AuthenticationRequest;
import org.apache.cassandra.thrift.CassandraServer;
import org.apache.cassandra.thrift.ThriftValidation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Node;

public class KVACAuthorityTest {

    private final KVACAuthority authority = new KVACAuthority();

    @Before
    public void setup() throws Exception {
        System.setProperty("access.properties", "test/conf/Policy.xml");
    }

    @Test
    public void testReadingOfPolicyFile() throws Exception {
        authority.readPolicyFile();
        Map<String, Node> policyMap = authority.getPolicyMap();
        Assert.assertNotNull(policyMap);

        Set<String> resourceSet = policyMap.keySet();

        int cnt = 0;
        for (String s : resourceSet) {
            Node n = policyMap.get(s);
            cnt++;
            System.out.println("Key" + cnt + ":" + s + " Value:"
                + n.getTextContent());
        }

        System.out.println("-- Done --");
    }

    @Test
    public void testColumnFamilyParsing() throws Exception {
        String cf = Evaluator
            .parseColumnFamily("/PatientInfoSystem/Patient(key=thisKey)/name");
        System.out.println(cf);
    }

    @Test
    public void testColumnNameParsing() throws Exception {
        String cf = Evaluator
            .parseColumn("/PatientInfoSystem/Patient(key=thisKey)/name");
        System.out.println(cf);
    }

    @Test
    @Ignore
    public void testKeyParsing() throws Exception {
        AuthenticatedUser user = new AuthenticatedUser("devdatta");
        String keyName = "sachin";
        byte[] keyNameArray = keyName.getBytes(Charset.forName("ISO-8859-1"));
        ByteBuffer keyOfAccessor = ByteBuffer.wrap(keyNameArray);

        ByteBuffer cf = Evaluator.parseKey(keyOfAccessor, user,
            "/PatientInfoSystem/Patient(key=thisKey)/name",null);
        System.out.println(KVACUtil.getStringRepresentation(cf));

        cf = Evaluator.parseKey(keyOfAccessor, user,
            "/PatientInfoSystem/Patient(key=user.name)/name",null);
        System.out.println(KVACUtil.getStringRepresentation(cf));
        
        cf = Evaluator.parseKey(keyOfAccessor, user,
            "/PatientInfoSystem/Doctor(key=/PatientInfoSystem/Patient(key=thisKey)/curr_doctor)/location",null);
    }

    @Test
    public void testDateComparison() throws Exception {
        String workHours = "2012/02/01 09:00:00 - 2012/02/01 06:00:00";
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        int i = Evaluator.compareDates(dateFormat.format(date),workHours);
        Assert.assertEquals(0, i);
    }

    /*
     * @Test public void testEvaluationOfIn() throws Exception {
     * System.setProperty("access.properties", "test/conf/TestPolicyIn.xml");
     * System.setProperty("passwd.properties", "test/conf/passwd.properties");
     * System.setProperty("passwd.mode","PLAIN"); authority.readPolicyFile();
     * Map<String, Node> policyMap = authority.getPolicyMap(); Set<String>
     * resourceSet = policyMap.keySet(); CassandraServer server = new
     * CassandraServer(); AuthenticationRequest auth_request = new
     * AuthenticationRequest(); Map<String, String> credentials = new
     * HashMap<String, String>(); credentials.put("username","devdatta");
     * credentials.put("password","devdatta");
     * auth_request.setCredentials(credentials); server.login(auth_request);
     * DatabaseDescriptor.loadSchemas();
     * server.set_keyspace("PatientInfoSystem"); //ThriftValidation
     * mockThriftValidator = Mockito.mock(ThriftValidation.class);
     * 
     * for(String s: resourceSet) { Node n = policyMap.get(s); boolean result =
     * Evaluator.evaluate_in(n,server); if (s.equals("1")) {
     * Assert.assertTrue(result); } if (s.equals("2")) {
     * Assert.assertFalse(result); } } }
     */
}
