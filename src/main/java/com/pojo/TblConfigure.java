package com.pojo;

public class TblConfigure {
    private String configureid;

    private String configuretype;

    private String configurename;

    private String filesize;

    private String url;

    private String downloadtimes;

    private String producer;

    private String configuretime;

    private Integer isconfigure;

    private String rename;

    public String getConfigureid() {
        return configureid;
    }

    public void setConfigureid(String configureid) {
        this.configureid = configureid == null ? null : configureid.trim();
    }

    public String getConfiguretype() {
        return configuretype;
    }

    public void setConfiguretype(String configuretype) {
        this.configuretype = configuretype == null ? null : configuretype.trim();
    }

    public String getConfigurename() {
        return configurename;
    }

    public void setConfigurename(String configurename) {
        this.configurename = configurename == null ? null : configurename.trim();
    }

    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize == null ? null : filesize.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getDownloadtimes() {
        return downloadtimes;
    }

    public void setDownloadtimes(String downloadtimes) {
        this.downloadtimes = downloadtimes == null ? null : downloadtimes.trim();
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer == null ? null : producer.trim();
    }

    public String getConfiguretime() {
        return configuretime;
    }

    public void setConfiguretime(String configuretime) {
        this.configuretime = configuretime == null ? null : configuretime.trim();
    }

    public Integer getIsconfigure() {
        return isconfigure;
    }

    public void setIsconfigure(Integer isconfigure) {
        this.isconfigure = isconfigure;
    }

    public String getRename() {
        return rename;
    }

    public void setRename(String rename) {
        this.rename = rename == null ? null : rename.trim();
    }
}