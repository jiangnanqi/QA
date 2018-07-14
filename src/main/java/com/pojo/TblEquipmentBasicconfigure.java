package com.pojo;

public class TblEquipmentBasicconfigure {
    private String equipmentbasicconfigureid;

    private String equipmentid;

    private String basicconfigureid;

    public String getEquipmentbasicconfigureid() {
        return equipmentbasicconfigureid;
    }

    public void setEquipmentbasicconfigureid(String equipmentbasicconfigureid) {
        this.equipmentbasicconfigureid = equipmentbasicconfigureid == null ? null : equipmentbasicconfigureid.trim();
    }

    public String getEquipmentid() {
        return equipmentid;
    }

    public void setEquipmentid(String equipmentid) {
        this.equipmentid = equipmentid == null ? null : equipmentid.trim();
    }

    public String getBasicconfigureid() {
        return basicconfigureid;
    }

    public void setBasicconfigureid(String basicconfigureid) {
        this.basicconfigureid = basicconfigureid == null ? null : basicconfigureid.trim();
    }
}