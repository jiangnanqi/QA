package com.pojo;

public class TblCommunityquestion {
    private String communityquestionid;

    private String time;

    private String title;

    private String classifyid;

    private String userid;

    private String scan;

    private Integer questionstate;

    private Integer isanswer;

    private String content;

    public String getCommunityquestionid() {
        return communityquestionid;
    }

    public void setCommunityquestionid(String communityquestionid) {
        this.communityquestionid = communityquestionid == null ? null : communityquestionid.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getClassifyid() {
        return classifyid;
    }

    public void setClassifyid(String classifyid) {
        this.classifyid = classifyid == null ? null : classifyid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getScan() {
        return scan;
    }

    public void setScan(String scan) {
        this.scan = scan == null ? null : scan.trim();
    }

    public Integer getQuestionstate() {
        return questionstate;
    }

    public void setQuestionstate(Integer questionstate) {
        this.questionstate = questionstate;
    }

    public Integer getIsanswer() {
        return isanswer;
    }

    public void setIsanswer(Integer isanswer) {
        this.isanswer = isanswer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}