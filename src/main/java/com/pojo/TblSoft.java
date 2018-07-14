package com.pojo;

public class TblSoft {
    private String configureid;

    private String softid;

    private String score;

    private String logo;

    private String versiontype;

    private String version;

    private String softtype;

    private String spareurl;

    private String os;

    private String website;

    public String getConfigureid() {
        return configureid;
    }

    public void setConfigureid(String configureid) {
        this.configureid = configureid == null ? null : configureid.trim();
    }

    public String getSoftid() {
        return softid;
    }

    public void setSoftid(String softid) {
        this.softid = softid == null ? null : softid.trim();
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getVersiontype() {
        return versiontype;
    }

    public void setVersiontype(String versiontype) {
        this.versiontype = versiontype == null ? null : versiontype.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getSofttype() {
        return softtype;
    }

    public void setSofttype(String softtype) {
        this.softtype = softtype == null ? null : softtype.trim();
    }

    public String getSpareurl() {
        return spareurl;
    }

    public void setSpareurl(String spareurl) {
        this.spareurl = spareurl == null ? null : spareurl.trim();
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os == null ? null : os.trim();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }
}