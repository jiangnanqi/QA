package com.pojo;

public class TblAdvise {
    private String adviseid;

    private String email;

    private String name;

    private String phone;

    private String text;

    private String annex;

    private String userid;

    private Integer states;

    private String advisetime;

    public String getAdviseid() {
        return adviseid;
    }

    public void setAdviseid(String adviseid) {
        this.adviseid = adviseid == null ? null : adviseid.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public String getAnnex() {
        return annex;
    }

    public void setAnnex(String annex) {
        this.annex = annex == null ? null : annex.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getStates() {
        return states;
    }

    public void setStates(Integer states) {
        this.states = states;
    }

    public String getAdvisetime() {
        return advisetime;
    }

    public void setAdvisetime(String advisetime) {
        this.advisetime = advisetime == null ? null : advisetime.trim();
    }
}