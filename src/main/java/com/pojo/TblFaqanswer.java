package com.pojo;

public class TblFaqanswer {
    private String faqanswerid;

    private String faqquestionid;

    private String userid;

    private String faqcontent;

    public String getFaqanswerid() {
        return faqanswerid;
    }

    public void setFaqanswerid(String faqanswerid) {
        this.faqanswerid = faqanswerid == null ? null : faqanswerid.trim();
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

    public String getFaqcontent() {
        return faqcontent;
    }

    public void setFaqcontent(String faqcontent) {
        this.faqcontent = faqcontent == null ? null : faqcontent.trim();
    }
}