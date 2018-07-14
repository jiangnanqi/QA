package com.pojo;

public class TblFaqpicture {
    private String faqpictureid;

    private String imgpath;

    private String description;

    private String userid;

    private String time;

    private Integer state;

    public String getFaqpictureid() {
        return faqpictureid;
    }

    public void setFaqpictureid(String faqpictureid) {
        this.faqpictureid = faqpictureid == null ? null : faqpictureid.trim();
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath == null ? null : imgpath.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}