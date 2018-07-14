package com.pojo;

public class TblUserEquipmentHistory {
    private String userequipmenthistoryid;

    private String userid;

    private String equipmentid;

    private String allocationstarttime;

    private String allocationendtime;

    public String getUserequipmenthistoryid() {
        return userequipmenthistoryid;
    }

    public void setUserequipmenthistoryid(String userequipmenthistoryid) {
        this.userequipmenthistoryid = userequipmenthistoryid == null ? null : userequipmenthistoryid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getEquipmentid() {
        return equipmentid;
    }

    public void setEquipmentid(String equipmentid) {
        this.equipmentid = equipmentid == null ? null : equipmentid.trim();
    }

    public String getAllocationstarttime() {
        return allocationstarttime;
    }

    public void setAllocationstarttime(String allocationstarttime) {
        this.allocationstarttime = allocationstarttime == null ? null : allocationstarttime.trim();
    }

    public String getAllocationendtime() {
        return allocationendtime;
    }

    public void setAllocationendtime(String allocationendtime) {
        this.allocationendtime = allocationendtime == null ? null : allocationendtime.trim();
    }
}