package com.view;

public class UserView {
    private String USERID;
    private String USERNAME;
    private String USEREMAIL;
    private String GENDER;
    private String USERBIRTHDAY;
    private String USERADDRESS;
    private String USERSIGNATURE;
    private String CREATETIME;
    private String ROLEID;
    private String ROLENAME;
    private String AVATAR;
    private String USERSTATE;

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getUSEREMAIL() {
        return USEREMAIL;
    }

    public void setUSEREMAIL(String USEREMAIL) {
        this.USEREMAIL = USEREMAIL;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public String getUSERBIRTHDAY() {
        return USERBIRTHDAY;
    }

    public void setUSERBIRTHDAY(String USERBIRTHDAY) {
        this.USERBIRTHDAY = USERBIRTHDAY;
    }

    public String getUSERADDRESS() {
        return USERADDRESS;
    }

    public void setUSERADDRESS(String USERADDRESS) {
        this.USERADDRESS = USERADDRESS;
    }

    public String getUSERSIGNATURE() {
        return USERSIGNATURE;
    }

    public void setUSERSIGNATURE(String USERSIGNATURE) {
        this.USERSIGNATURE = USERSIGNATURE;
    }

    public String getCREATETIME() {
        return CREATETIME;
    }

    public void setCREATETIME(String CREATETIME) {
        this.CREATETIME = CREATETIME;
    }

    public String getROLEID() {
        return ROLEID;
    }

    public void setROLEID(String ROLEID) {
        this.ROLEID = ROLEID;
    }

    public String getROLENAME() {
        return ROLENAME;
    }

    public void setROLENAME(String ROLENAME) {
        this.ROLENAME = ROLENAME;
    }

    public String getAVATAR() {
        return AVATAR;
    }

    public void setAVATAR(String AVATAR) {
        this.AVATAR = AVATAR;
    }

    public String getUSERSTATE() {
        return USERSTATE;
    }

    public void setUSERSTATE(String USERSTATE) {
        this.USERSTATE = USERSTATE;
    }

    @Override
    public String toString() {
        return "UserView{" +
                "USERID='" + USERID + '\'' +
                ", USERNAME='" + USERNAME + '\'' +
                ", USEREMAIL='" + USEREMAIL + '\'' +
                ", GENDER='" + GENDER + '\'' +
                ", USERBIRTHDAY='" + USERBIRTHDAY + '\'' +
                ", USERADDRESS='" + USERADDRESS + '\'' +
                ", USERSIGNATURE='" + USERSIGNATURE + '\'' +
                ", CREATETIME='" + CREATETIME + '\'' +
                ", ROLEID='" + ROLEID + '\'' +
                ", ROLENAME='" + ROLENAME + '\'' +
                ", AVATAR='" + AVATAR + '\'' +
                ", USERSTATE='" + USERSTATE + '\'' +
                '}';
    }
}
