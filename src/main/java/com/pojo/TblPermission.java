package com.pojo;

public class TblPermission {
    private String permissionid;

    private String permissionphysicalname;

    private String permissionlogicname;

    private String time;

    public String getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(String permissionid) {
        this.permissionid = permissionid == null ? null : permissionid.trim();
    }

    public String getPermissionphysicalname() {
        return permissionphysicalname;
    }

    public void setPermissionphysicalname(String permissionphysicalname) {
        this.permissionphysicalname = permissionphysicalname == null ? null : permissionphysicalname.trim();
    }

    public String getPermissionlogicname() {
        return permissionlogicname;
    }

    public void setPermissionlogicname(String permissionlogicname) {
        this.permissionlogicname = permissionlogicname == null ? null : permissionlogicname.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }
}