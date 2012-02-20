package org.apache.cassandra.auth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RoleAuthorityTest {

    private RoleAuthority authority;

    private final List<Object> STANDARD1_RESOURCE = Arrays.<Object> asList(
        Resources.ROOT, Resources.KEYSPACES, "Keyspace1", "Standard1");

    @Before
    public void setup() throws Exception {
        System.setProperty("access.properties", "test/conf/access.properties");
    }

    @Test
    public void testRoleAuthorityCreation() throws Exception {

        ArrayList<String> roleToResource = new ArrayList<String>();
        roleToResource.add("Friend.<r>=Keyspace1.Standard1");
        roleToResource.add("Owner.<rw>=Keyspace1.Standard1");

        ArrayList<String> userToRole = new ArrayList<String>();
        userToRole.add("jsmith=Friend");

        authority = new RoleAuthority(roleToResource, userToRole);
        Assert.assertNotNull(authority);
    }

    @Test
    public void testUserPermissionsWhenUserIsInRole() throws Exception {
        ArrayList<String> roleToResource = new ArrayList<String>();
        roleToResource.add("Friend.<r>=Keyspace1.Standard1");

        ArrayList<String> userToRole = new ArrayList<String>();
        userToRole.add("jsmith=Friend");

        authority = new RoleAuthority(roleToResource, userToRole);

        Set<String> roles = new LinkedHashSet<String>();
        roles.add("Friend");
        AuthenticatedUser user = new AuthenticatedUser("jsmith", roles);

        EnumSet<Permission> permSet = authority.authorize(user,
            STANDARD1_RESOURCE);
        Assert.assertEquals(1, permSet.size());

        Permission permArray[] = (Permission[]) permSet.toArray();
        Assert.assertEquals("r", permArray[0].toString());
    }

    @Test
    public void testKVACPermission() throws Exception {
        Set<String> roles = new LinkedHashSet<String>();
        roles.add("Friend");
        AuthenticatedUser user = new AuthenticatedUser("jsmith", roles);

        authority = new RoleAuthority();

        String resourcePath = "//Patient";

        EnumSet<Permission> permSet = authority.authorize(user, resourcePath);
    }
}
