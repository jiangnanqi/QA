package com.pojo;

public class TblIt {
    private String userid;

    private String goodwork;

    private String workage;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getGoodwork() {
        return goodwork;
    }

    public void setGoodwork(String goodwork) {
        this.goodwork = goodwork == null ? null : goodwork.trim();
    }

    public String getWorkage() {
        return workage;
    }

    public void setWorkage(String workage) {
        this.workage = workage == null ? null : workage.trim();
    }
}