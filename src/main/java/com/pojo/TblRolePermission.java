package com.pojo;

public class TblRolePermission {
    private String rolepermissionid;

    private String roleid;

    private String permissionid;

    public String getRolepermissionid() {
        return rolepermissionid;
    }

    public void setRolepermissionid(String rolepermissionid) {
        this.rolepermissionid = rolepermissionid == null ? null : rolepermissionid.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(String permissionid) {
        this.permissionid = permissionid == null ? null : permissionid.trim();
    }
}