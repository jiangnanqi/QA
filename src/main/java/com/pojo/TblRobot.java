package com.pojo;

public class TblRobot {
    private String robotid;

    private String robotname;

    private String robotimage;

    private String robotintroduction;

    private String robotwelcome;

    private String robotnoknow;

    public String getRobotid() {
        return robotid;
    }

    public void setRobotid(String robotid) {
        this.robotid = robotid == null ? null : robotid.trim();
    }

    public String getRobotname() {
        return robotname;
    }

    public void setRobotname(String robotname) {
        this.robotname = robotname == null ? null : robotname.trim();
    }

    public String getRobotimage() {
        return robotimage;
    }

    public void setRobotimage(String robotimage) {
        this.robotimage = robotimage == null ? null : robotimage.trim();
    }

    public String getRobotintroduction() {
        return robotintroduction;
    }

    public void setRobotintroduction(String robotintroduction) {
        this.robotintroduction = robotintroduction == null ? null : robotintroduction.trim();
    }

    public String getRobotwelcome() {
        return robotwelcome;
    }

    public void setRobotwelcome(String robotwelcome) {
        this.robotwelcome = robotwelcome == null ? null : robotwelcome.trim();
    }

    public String getRobotnoknow() {
        return robotnoknow;
    }

    public void setRobotnoknow(String robotnoknow) {
        this.robotnoknow = robotnoknow == null ? null : robotnoknow.trim();
    }
}