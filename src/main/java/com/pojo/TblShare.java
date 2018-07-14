package com.pojo;

public class TblShare {
    private String shareid;

    private String userid;

    private String time;

    private String faqquestionid;

    private String communityquestionid;

    public String getShareid() {
        return shareid;
    }

    public void setShareid(String shareid) {
        this.shareid = shareid == null ? null : shareid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getFaqquestionid() {
        return faqquestionid;
    }

    public void setFaqquestionid(String faqquestionid) {
        this.faqquestionid = faqquestionid == null ? null : faqquestionid.trim();
    }

    public String getCommunityquestionid() {
        return communityquestionid;
    }

    public void setCommunityquestionid(String communityquestionid) {
        this.communityquestionid = communityquestionid == null ? null : communityquestionid.trim();
    }
}