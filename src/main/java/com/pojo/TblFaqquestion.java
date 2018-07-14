package com.pojo;

public class TblFaqquestion {
    private String faqquestionid;

    private String faqtitle;

    private String faqkeywords;

    private String faqclassifyid;

    private String collection;

    private String scan;

    private String modifytime;

    private String modifynumber;

    private Integer faqstate;

    private String userid;

    private String faqdescription;

    public String getFaqquestionid() {
        return faqquestionid;
    }

    public void setFaqquestionid(String faqquestionid) {
        this.faqquestionid = faqquestionid == null ? null : faqquestionid.trim();
    }

    public String getFaqtitle() {
        return faqtitle;
    }

    public void setFaqtitle(String faqtitle) {
        this.faqtitle = faqtitle == null ? null : faqtitle.trim();
    }

    public String getFaqkeywords() {
        return faqkeywords;
    }

    public void setFaqkeywords(String faqkeywords) {
        this.faqkeywords = faqkeywords == null ? null : faqkeywords.trim();
    }

    public String getFaqclassifyid() {
        return faqclassifyid;
    }

    public void setFaqclassifyid(String faqclassifyid) {
        this.faqclassifyid = faqclassifyid == null ? null : faqclassifyid.trim();
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection == null ? null : collection.trim();
    }

    public String getScan() {
        return scan;
    }

    public void setScan(String scan) {
        this.scan = scan == null ? null : scan.trim();
    }

    public String getModifytime() {
        return modifytime;
    }

    public void setModifytime(String modifytime) {
        this.modifytime = modifytime == null ? null : modifytime.trim();
    }

    public String getModifynumber() {
        return modifynumber;
    }

    public void setModifynumber(String modifynumber) {
        this.modifynumber = modifynumber == null ? null : modifynumber.trim();
    }

    public Integer getFaqstate() {
        return faqstate;
    }

    public void setFaqstate(Integer faqstate) {
        this.faqstate = faqstate;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getFaqdescription() {
        return faqdescription;
    }

    public void setFaqdescription(String faqdescription) {
        this.faqdescription = faqdescription == null ? null : faqdescription.trim();
    }
}