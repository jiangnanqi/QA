package com.pojo;

public class TblPay {
    private String payid;

    private String payuserid;

    private String bepayuserid;

    private String time;

    public String getPayid() {
        return payid;
    }

    public void setPayid(String payid) {
        this.payid = payid == null ? null : payid.trim();
    }

    public String getPayuserid() {
        return payuserid;
    }

    public void setPayuserid(String payuserid) {
        this.payuserid = payuserid == null ? null : payuserid.trim();
    }

    public String getBepayuserid() {
        return bepayuserid;
    }

    public void setBepayuserid(String bepayuserid) {
        this.bepayuserid = bepayuserid == null ? null : bepayuserid.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }
}