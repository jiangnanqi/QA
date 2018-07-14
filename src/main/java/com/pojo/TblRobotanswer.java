package com.pojo;

public class TblRobotanswer {
    private String robotanswerid;

    private String userquestionid;

    private String faqanswerid;

    private Integer saticfaction;

    private Integer questionstate;

    public String getRobotanswerid() {
        return robotanswerid;
    }

    public void setRobotanswerid(String robotanswerid) {
        this.robotanswerid = robotanswerid == null ? null : robotanswerid.trim();
    }

    public String getUserquestionid() {
        return userquestionid;
    }

    public void setUserquestionid(String userquestionid) {
        this.userquestionid = userquestionid == null ? null : userquestionid.trim();
    }

    public String getFaqanswerid() {
        return faqanswerid;
    }

    public void setFaqanswerid(String faqanswerid) {
        this.faqanswerid = faqanswerid == null ? null : faqanswerid.trim();
    }

    public Integer getSaticfaction() {
        return saticfaction;
    }

    public void setSaticfaction(Integer saticfaction) {
        this.saticfaction = saticfaction;
    }

    public Integer getQuestionstate() {
        return questionstate;
    }

    public void setQuestionstate(Integer questionstate) {
        this.questionstate = questionstate;
    }
}