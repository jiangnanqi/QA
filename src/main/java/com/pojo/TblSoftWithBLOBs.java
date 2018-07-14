package com.pojo;

public class TblSoftWithBLOBs extends TblSoft {
    private String introduction;

    private String description;

    private String newversionintroduction;

    private String newversiondescription;

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getNewversionintroduction() {
        return newversionintroduction;
    }

    public void setNewversionintroduction(String newversionintroduction) {
        this.newversionintroduction = newversionintroduction == null ? null : newversionintroduction.trim();
    }

    public String getNewversiondescription() {
        return newversiondescription;
    }

    public void setNewversiondescription(String newversiondescription) {
        this.newversiondescription = newversiondescription == null ? null : newversiondescription.trim();
    }
}