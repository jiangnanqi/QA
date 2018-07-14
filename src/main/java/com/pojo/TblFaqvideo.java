package com.pojo;

public class TblFaqvideo {
    private String faqvideoid;

    private String url;

    private String description;

    private String faqanswerid;

    public String getFaqvideoid() {
        return faqvideoid;
    }

    public void setFaqvideoid(String faqvideoid) {
        this.faqvideoid = faqvideoid == null ? null : faqvideoid.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getFaqanswerid() {
        return faqanswerid;
    }

    public void setFaqanswerid(String faqanswerid) {
        this.faqanswerid = faqanswerid == null ? null : faqanswerid.trim();
    }
}