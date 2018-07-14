package com.pojo;

public class TblAgree {
    private String agreeid;

    private String communityanswerid;

    private String userid;

    private String touserid;

    private String time;

    private Integer isnotice;

    public String getAgreeid() {
        return agreeid;
    }

    public void setAgreeid(String agreeid) {
        this.agreeid = agreeid == null ? null : agreeid.trim();
    }

    public String getCommunityanswerid() {
        return communityanswerid;
    }

    public void setCommunityanswerid(String communityanswerid) {
        this.communityanswerid = communityanswerid == null ? null : communityanswerid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getTouserid() {
        return touserid;
    }

    public void setTouserid(String touserid) {
        this.touserid = touserid == null ? null : touserid.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public Integer getIsnotice() {
        return isnotice;
    }

    public void setIsnotice(Integer isnotice) {
        this.isnotice = isnotice;
    }
}