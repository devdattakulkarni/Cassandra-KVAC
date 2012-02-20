package org.apache.cassandra.auth;

import java.util.EnumSet;

public class Role {
    private String roleName;
    private EnumSet<Permission> permissions;

    public Role(String roleName, EnumSet<Permission> permissions) {
        this.roleName = roleName;
        this.permissions = permissions;
    }

    public String getRoleName() {
        return roleName;
    }

    public EnumSet<Permission> getPermissions() {
        return permissions;
    }
}
