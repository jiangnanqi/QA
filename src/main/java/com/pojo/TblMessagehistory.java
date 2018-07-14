package com.pojo;

public class TblMessagehistory {
    private String messagehistoryid;

    private String postuserid;

    private String getuserid;

    private String timemark;

    public String getMessagehistoryid() {
        return messagehistoryid;
    }

    public void setMessagehistoryid(String messagehistoryid) {
        this.messagehistoryid = messagehistoryid == null ? null : messagehistoryid.trim();
    }

    public String getPostuserid() {
        return postuserid;
    }

    public void setPostuserid(String postuserid) {
        this.postuserid = postuserid == null ? null : postuserid.trim();
    }

    public String getGetuserid() {
        return getuserid;
    }

    public void setGetuserid(String getuserid) {
        this.getuserid = getuserid == null ? null : getuserid.trim();
    }

    public String getTimemark() {
        return timemark;
    }

    public void setTimemark(String timemark) {
        this.timemark = timemark == null ? null : timemark.trim();
    }
}