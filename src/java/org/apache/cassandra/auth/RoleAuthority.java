package org.apache.cassandra.auth;

import java.nio.ByteBuffer;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.cassandra.config.ConfigurationException;
import org.apache.cassandra.thrift.CassandraServer;

public class RoleAuthority implements IAuthority {

    Map<Role, String> rolePermToResource;
    Map<String, String> userToRole;
    
    public RoleAuthority() {      
    }

    /*
     * 1. Other authorities do not have constructors. We can model RoleAuthority
     * similar to them -- but we want to maintain an updated list of users and
     * their roles. This will require us to maintain an in-memory of map of
     * users and their role memberships.
     */
    public RoleAuthority(List<String> rolePermToResourceList,
        List<String> userToRoleList) {

        rolePermToResource = new HashMap<Role, String>();

        for (String s : rolePermToResourceList) {
            String r[] = s.split("=");
            String rolePerms = r[0];
            String resource = r[1];
            EnumSet<Permission> permissionSet = null;
            System.out.println("{" + rolePerms + "}");
            String p[] = rolePerms.split("\\.");

            String roleName = p[0];
            String permissions = p[1];
            if (permissions.equals("<rw>") || permissions.equals("<wr>")) {
                permissionSet = Permission.ALL;
            }
            if (permissions.equals("<r>")) {
                permissionSet = EnumSet.of(Permission.READ);
            }
            if (permissions.equals("<w>")) {
                permissionSet = EnumSet.of(Permission.WRITE);
            }

            Role role = new Role(roleName, permissionSet);

            rolePermToResource.put(role, resource);
        }

        userToRole = new HashMap<String, String>();
        for (String s : userToRoleList) {
            String u[] = s.split("=");
            userToRole.put(u[0], u[1]);
        }
    }

    //@Override
    public EnumSet<Permission> authorize(AuthenticatedUser user,
        List<Object> resourceList) {

        EnumSet<Permission> perms = Permission.NONE;

        // Find which permissions can be granted to the user based on the
        // user's role membership and the roles that have permissions for the
        // given list of resource.

        Set<String> groups = user.groups;
        for (String g : groups) {
            // Find the resource 'r' from the rolePermToResource corresponding
            // to 'g'
            // If the 'resourceList' contains r, then find
        }

        return perms;
    }

    //@Override
    public void validateConfiguration() throws ConfigurationException {
        // TODO Auto-generated method stub
    }

    /**
     * K-VAC 
     */
    //@Override
    public EnumSet<Permission> authorize(AuthenticatedUser user,
        String resourcePath) {
        
        String policy = readPolicyFromFile(resourcePath);
        
        String resource = "//Patient/id";
        //String selector = "//Doctor/id=thisUser.id/curr_patients"; <-- This is what we ideally want.
        
        String selector = "//Doctor/name=devdatta/curr_patients";
        String selectorColumn = "curr_patients";
        
        String resourceCF = "Patient";
        String selectorCF = "Doctor";
        
        // 1. Query the resourceCF and get a list of all the rows in that CF.
        // 2. Query the selectorCF and get the row for key devdatta
        // 3. Get the values of the selectorColumn from the selector row found in step 2.
        // 4. For each row found in step 1, select only those rows whose keys are present in the values obtained in Step 3.
        
        return null;
    }
    
    /**
     * Read the access control policy from the access.properties file.
     * @return
     */
    private String readPolicyFromFile(String resourcePath) {
       String policy = "";
       if (resourcePath.equals("//Patient")) {
           policy = "//Patient where //Patient/id in //Doctor/id=thisUser.id/curr_patients";
       }
       return policy;
    }

    public EnumSet<Permission> authorize(ByteBuffer key, AuthenticatedUser user,
        List<Object> columnNameValueMap, CassandraServer server) {
        // TODO Auto-generated method stub
        return null;
    }
}
