package com.pojo;

public class TblDriver {
    private String configureid;

    private String os;

    private String drivertype;

    private String fitness;

    private String driverintroduction;

    public String getConfigureid() {
        return configureid;
    }

    public void setConfigureid(String configureid) {
        this.configureid = configureid == null ? null : configureid.trim();
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os == null ? null : os.trim();
    }

    public String getDrivertype() {
        return drivertype;
    }

    public void setDrivertype(String drivertype) {
        this.drivertype = drivertype == null ? null : drivertype.trim();
    }

    public String getFitness() {
        return fitness;
    }

    public void setFitness(String fitness) {
        this.fitness = fitness == null ? null : fitness.trim();
    }

    public String getDriverintroduction() {
        return driverintroduction;
    }

    public void setDriverintroduction(String driverintroduction) {
        this.driverintroduction = driverintroduction == null ? null : driverintroduction.trim();
    }
}