package com.pojo;

public class TblFaqclassify {
    private String faqclassifyid;

    private String faqclassifyname;

    private String faqparentid;

    private String faqclassifyimage;

    public String getFaqclassifyid() {
        return faqclassifyid;
    }

    public void setFaqclassifyid(String faqclassifyid) {
        this.faqclassifyid = faqclassifyid == null ? null : faqclassifyid.trim();
    }

    public String getFaqclassifyname() {
        return faqclassifyname;
    }

    public void setFaqclassifyname(String faqclassifyname) {
        this.faqclassifyname = faqclassifyname == null ? null : faqclassifyname.trim();
    }

    public String getFaqparentid() {
        return faqparentid;
    }

    public void setFaqparentid(String faqparentid) {
        this.faqparentid = faqparentid == null ? null : faqparentid.trim();
    }

    public String getFaqclassifyimage() {
        return faqclassifyimage;
    }

    public void setFaqclassifyimage(String faqclassifyimage) {
        this.faqclassifyimage = faqclassifyimage == null ? null : faqclassifyimage.trim();
    }
}