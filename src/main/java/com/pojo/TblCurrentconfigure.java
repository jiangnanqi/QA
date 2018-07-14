package com.pojo;

public class TblCurrentconfigure {
    private String currentconfigureid;

    private String equipmentid;

    private String configureversion;

    private String configurename;

    private String configuretype;

    public String getCurrentconfigureid() {
        return currentconfigureid;
    }

    public void setCurrentconfigureid(String currentconfigureid) {
        this.currentconfigureid = currentconfigureid == null ? null : currentconfigureid.trim();
    }

    public String getEquipmentid() {
        return equipmentid;
    }

    public void setEquipmentid(String equipmentid) {
        this.equipmentid = equipmentid == null ? null : equipmentid.trim();
    }

    public String getConfigureversion() {
        return configureversion;
    }

    public void setConfigureversion(String configureversion) {
        this.configureversion = configureversion == null ? null : configureversion.trim();
    }

    public String getConfigurename() {
        return configurename;
    }

    public void setConfigurename(String configurename) {
        this.configurename = configurename == null ? null : configurename.trim();
    }

    public String getConfiguretype() {
        return configuretype;
    }

    public void setConfiguretype(String configuretype) {
        this.configuretype = configuretype == null ? null : configuretype.trim();
    }
}