package com.pojo;

public class TblCommunityanswer {
    private String communityanswerid;

    private String time;

    private Integer isbestanswer;

    private String communityquestionid;

    private String userid;

    private Integer isnotice;

    private String content;

    public String getCommunityanswerid() {
        return communityanswerid;
    }

    public void setCommunityanswerid(String communityanswerid) {
        this.communityanswerid = communityanswerid == null ? null : communityanswerid.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public Integer getIsbestanswer() {
        return isbestanswer;
    }

    public void setIsbestanswer(Integer isbestanswer) {
        this.isbestanswer = isbestanswer;
    }

    public String getCommunityquestionid() {
        return communityquestionid;
    }

    public void setCommunityquestionid(String communityquestionid) {
        this.communityquestionid = communityquestionid == null ? null : communityquestionid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getIsnotice() {
        return isnotice;
    }

    public void setIsnotice(Integer isnotice) {
        this.isnotice = isnotice;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}