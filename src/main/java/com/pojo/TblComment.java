package com.pojo;

public class TblComment {
    private String commentid;

    private String faqquestionid;

    private String communityquestionid;

    private String userid;

    private String commentcontent;

    private String commenttime;

    private String commentparentid;

    private String touserid;

    private Integer isnotice;

    public String getCommentid() {
        return commentid;
    }

    public void setCommentid(String commentid) {
        this.commentid = commentid == null ? null : commentid.trim();
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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getCommentcontent() {
        return commentcontent;
    }

    public void setCommentcontent(String commentcontent) {
        this.commentcontent = commentcontent == null ? null : commentcontent.trim();
    }

    public String getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(String commenttime) {
        this.commenttime = commenttime == null ? null : commenttime.trim();
    }

    public String getCommentparentid() {
        return commentparentid;
    }

    public void setCommentparentid(String commentparentid) {
        this.commentparentid = commentparentid == null ? null : commentparentid.trim();
    }

    public String getTouserid() {
        return touserid;
    }

    public void setTouserid(String touserid) {
        this.touserid = touserid == null ? null : touserid.trim();
    }

    public Integer getIsnotice() {
        return isnotice;
    }

    public void setIsnotice(Integer isnotice) {
        this.isnotice = isnotice;
    }
}