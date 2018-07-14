package com.pojo;

public class TblUser {
    private String userid;

    private String username;

    private String userpassword;

    private String useremail;

    private String gender;

    private String userbirthday;

    private String useraddress;

    private String usersignature;

    private String createtime;

    private String roleid;

    private String avatar;

    private Integer userstate;

    private String verificationcode;

    private String timeremarks;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getUserbirthday() {
        return userbirthday;
    }

    public void setUserbirthday(String userbirthday) {
        this.userbirthday = userbirthday == null ? null : userbirthday.trim();
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress == null ? null : useraddress.trim();
    }

    public String getUsersignature() {
        return usersignature;
    }

    public void setUsersignature(String usersignature) {
        this.usersignature = usersignature == null ? null : usersignature.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Integer getUserstate() {
        return userstate;
    }

    public void setUserstate(Integer userstate) {
        this.userstate = userstate;
    }

    public String getVerificationcode() {
        return verificationcode;
    }

    public void setVerificationcode(String verificationcode) {
        this.verificationcode = verificationcode == null ? null : verificationcode.trim();
    }

    public String getTimeremarks() {
        return timeremarks;
    }

    public void setTimeremarks(String timeremarks) {
        this.timeremarks = timeremarks == null ? null : timeremarks.trim();
    }

    @Override
    public String toString() {
        return "TblUser{" +
                "userid='" + userid + '\'' +
                ", username='" + username + '\'' +
                ", userpassword='" + userpassword + '\'' +
                ", useremail='" + useremail + '\'' +
                ", gender='" + gender + '\'' +
                ", userbirthday='" + userbirthday + '\'' +
                ", useraddress='" + useraddress + '\'' +
                ", usersignature='" + usersignature + '\'' +
                ", createtime='" + createtime + '\'' +
                ", roleid='" + roleid + '\'' +
                ", avatar='" + avatar + '\'' +
                ", userstate=" + userstate +
                ", verificationcode='" + verificationcode + '\'' +
                ", timeremarks='" + timeremarks + '\'' +
                '}';
    }
}