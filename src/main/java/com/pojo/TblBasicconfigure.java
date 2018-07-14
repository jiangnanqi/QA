package com.pojo;

public class TblBasicconfigure {
    private String basicconfigure;

    private String configureid;

    private String departmentid;

    public String getBasicconfigure() {
        return basicconfigure;
    }

    public void setBasicconfigure(String basicconfigure) {
        this.basicconfigure = basicconfigure == null ? null : basicconfigure.trim();
    }

    public String getConfigureid() {
        return configureid;
    }

    public void setConfigureid(String configureid) {
        this.configureid = configureid == null ? null : configureid.trim();
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid == null ? null : departmentid.trim();
    }
}