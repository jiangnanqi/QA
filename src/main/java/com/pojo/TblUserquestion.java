package com.pojo;

public class TblUserquestion {
    private String userquestionid;

    private String questiontitle;

    private String questiontime;

    private Integer isfaq;

    private String userid;

    public String getUserquestionid() {
        return userquestionid;
    }

    public void setUserquestionid(String userquestionid) {
        this.userquestionid = userquestionid == null ? null : userquestionid.trim();
    }

    public String getQuestiontitle() {
        return questiontitle;
    }

    public void setQuestiontitle(String questiontitle) {
        this.questiontitle = questiontitle == null ? null : questiontitle.trim();
    }

    public String getQuestiontime() {
        return questiontime;
    }

    public void setQuestiontime(String questiontime) {
        this.questiontime = questiontime == null ? null : questiontime.trim();
    }

    public Integer getIsfaq() {
        return isfaq;
    }

    public void setIsfaq(Integer isfaq) {
        this.isfaq = isfaq;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}