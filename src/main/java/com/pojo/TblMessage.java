package com.pojo;

public class TblMessage {
    private String messageid;

    private String messagecontent;

    private String messagetime;

    private Integer messagestate;

    private String postuserid;

    private String getuserid;

    public String getMessageid() {
        return messageid;
    }

    public void setMessageid(String messageid) {
        this.messageid = messageid == null ? null : messageid.trim();
    }

    public String getMessagecontent() {
        return messagecontent;
    }

    public void setMessagecontent(String messagecontent) {
        this.messagecontent = messagecontent == null ? null : messagecontent.trim();
    }

    public String getMessagetime() {
        return messagetime;
    }

    public void setMessagetime(String messagetime) {
        this.messagetime = messagetime == null ? null : messagetime.trim();
    }

    public Integer getMessagestate() {
        return messagestate;
    }

    public void setMessagestate(Integer messagestate) {
        this.messagestate = messagestate;
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
}