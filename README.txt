Cassandra-KVAC is implementation of Cassandra with the Key-Value Access Control Model (K-VAC).

Starting from the main Cassandra code base, we have added functionality
to support fine-grained access control model (K-VAC) for Cassandra.
In K-VAC, access control policies can be specified at the level of
rows and columns, along with keyspace and a column family.
Moreover, K-VAC supports content-based and context-based access control.

Design
-------
We define a new class called KVACAuthority in the org.apache.cassandra.auth package 
which enforces the K-VAC policies. The KVACAuthority implements the IAuthority interface.

To use K-VAC for access control, change the creation of authority in the 
DatabaseDescriptor class from SimpleAuthority to KVACAuthority.
To demonstrate use of K-VAC we have modified the ``get_slice'' method and 
the ``internal_get'' method of the CassandraServer class which is present in the org.apache.cassandra.thrift package.

The K-VAC policies are specified in XML. A sample policy file (Policy.xml)
is provided in conf directory.

Running Cassandra with K-VAC for the example Policy:
------------------------------------------------------
1) Run CassandraDaemon with the following VM arguments:
   -Dstorage-config=/Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/conf
   -Dcassandra-foreground 
   -ea -Xmx1G
   -Daccess.properties=/Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/conf/Policy.xml
   -Dpasswd.properties=/Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/conf/passwd.properties

   This will start Cassandra Cluster on port 9170.

2) Go to cassandra's bin directory:
   
3) Execute: ./cassandra-cli

4) Connect to the cassandra cluster started in step 1:
   - connect localhost/9170 devdatta 'devdatta';

5) Create keyspace PatientInfoSystem:

6) Specify the Keyspace to use:
   - use PatientInfoSystem;

7) Execute a get:
   - get Doctor[jsmith];

DISCLAIMER:
------------
This code is currently at an experimental stage. PLEASE DO NOT use it for 
any critical projects. If you are looking for official version of Cassandra,
it can be found at:

http://cassandra.apache.org/

