package com.pojo;

public class TblDatadictionary {
    private String datadictionaryid;

    private String dataname;

    private String datavalue;

    private String remarks;

    private Integer datatype;

    private String datarange;

    public String getDatadictionaryid() {
        return datadictionaryid;
    }

    public void setDatadictionaryid(String datadictionaryid) {
        this.datadictionaryid = datadictionaryid == null ? null : datadictionaryid.trim();
    }

    public String getDataname() {
        return dataname;
    }

    public void setDataname(String dataname) {
        this.dataname = dataname == null ? null : dataname.trim();
    }

    public String getDatavalue() {
        return datavalue;
    }

    public void setDatavalue(String datavalue) {
        this.datavalue = datavalue == null ? null : datavalue.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getDatatype() {
        return datatype;
    }

    public void setDatatype(Integer datatype) {
        this.datatype = datatype;
    }

    public String getDatarange() {
        return datarange;
    }

    public void setDatarange(String datarange) {
        this.datarange = datarange == null ? null : datarange.trim();
    }
}