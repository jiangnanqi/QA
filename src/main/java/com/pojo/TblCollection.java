package com.pojo;

public class TblCollection {
    private String collectionid;

    private String communityanswerid;

    private String faqquestionid;

    private String userid;

    private String time;

    private Integer isnotice;

    public String getCollectionid() {
        return collectionid;
    }

    public void setCollectionid(String collectionid) {
        this.collectionid = collectionid == null ? null : collectionid.trim();
    }

    public String getCommunityanswerid() {
        return communityanswerid;
    }

    public void setCommunityanswerid(String communityanswerid) {
        this.communityanswerid = communityanswerid == null ? null : communityanswerid.trim();
    }

    public String getFaqquestionid() {
        return faqquestionid;
    }

    public void setFaqquestionid(String faqquestionid) {
        this.faqquestionid = faqquestionid == null ? null : faqquestionid.trim();
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

    public Integer getIsnotice() {
        return isnotice;
    }

    public void setIsnotice(Integer isnotice) {
        this.isnotice = isnotice;
    }
}