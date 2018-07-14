package com.pojo;

public class TblPatch {
    private String configureid;

    private String patchnumber;

    private String language;

    public String getConfigureid() {
        return configureid;
    }

    public void setConfigureid(String configureid) {
        this.configureid = configureid == null ? null : configureid.trim();
    }

    public String getPatchnumber() {
        return patchnumber;
    }

    public void setPatchnumber(String patchnumber) {
        this.patchnumber = patchnumber == null ? null : patchnumber.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }
}