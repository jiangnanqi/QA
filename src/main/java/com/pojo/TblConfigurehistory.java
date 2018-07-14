package com.pojo;

public class TblConfigurehistory {
    private String configurehistoryid;

    private String updatetime;

    private String version;

    private String configureid;

    private String url;

    private String remarks;

    public String getConfigurehistoryid() {
        return configurehistoryid;
    }

    public void setConfigurehistoryid(String configurehistoryid) {
        this.configurehistoryid = configurehistoryid == null ? null : configurehistoryid.trim();
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime == null ? null : updatetime.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getConfigureid() {
        return configureid;
    }

    public void setConfigureid(String configureid) {
        this.configureid = configureid == null ? null : configureid.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}