package com.pojo;

public class TblCurrentequipment {
    private String equipmentid;

    private String macaddress;

    private String equipmentmodel;

    private String equipmenttime;

    private String ip;

    private String cpu;

    private String ram;

    private String harddriver;

    private String harddrivermodel;

    private String storage;

    private String networkcard;

    private String motherboard;

    private String osname;

    private String ostype;

    private String osversion;

    private String osid;

    private String userid;

    private Integer isnotice;

    private String graphiccard;

    private String audiocard;

    private String timeremarks;

    public String getEquipmentid() {
        return equipmentid;
    }

    public void setEquipmentid(String equipmentid) {
        this.equipmentid = equipmentid == null ? null : equipmentid.trim();
    }

    public String getMacaddress() {
        return macaddress;
    }

    public void setMacaddress(String macaddress) {
        this.macaddress = macaddress == null ? null : macaddress.trim();
    }

    public String getEquipmentmodel() {
        return equipmentmodel;
    }

    public void setEquipmentmodel(String equipmentmodel) {
        this.equipmentmodel = equipmentmodel == null ? null : equipmentmodel.trim();
    }

    public String getEquipmenttime() {
        return equipmenttime;
    }

    public void setEquipmenttime(String equipmenttime) {
        this.equipmenttime = equipmenttime == null ? null : equipmenttime.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu == null ? null : cpu.trim();
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram == null ? null : ram.trim();
    }

    public String getHarddriver() {
        return harddriver;
    }

    public void setHarddriver(String harddriver) {
        this.harddriver = harddriver == null ? null : harddriver.trim();
    }

    public String getHarddrivermodel() {
        return harddrivermodel;
    }

    public void setHarddrivermodel(String harddrivermodel) {
        this.harddrivermodel = harddrivermodel == null ? null : harddrivermodel.trim();
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage == null ? null : storage.trim();
    }

    public String getNetworkcard() {
        return networkcard;
    }

    public void setNetworkcard(String networkcard) {
        this.networkcard = networkcard == null ? null : networkcard.trim();
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard == null ? null : motherboard.trim();
    }

    public String getOsname() {
        return osname;
    }

    public void setOsname(String osname) {
        this.osname = osname == null ? null : osname.trim();
    }

    public String getOstype() {
        return ostype;
    }

    public void setOstype(String ostype) {
        this.ostype = ostype == null ? null : ostype.trim();
    }

    public String getOsversion() {
        return osversion;
    }

    public void setOsversion(String osversion) {
        this.osversion = osversion == null ? null : osversion.trim();
    }

    public String getOsid() {
        return osid;
    }

    public void setOsid(String osid) {
        this.osid = osid == null ? null : osid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getIsnotice() {
        return isnotice;
    }

    public void setIsnotice(Integer isnotice) {
        this.isnotice = isnotice;
    }

    public String getGraphiccard() {
        return graphiccard;
    }

    public void setGraphiccard(String graphiccard) {
        this.graphiccard = graphiccard == null ? null : graphiccard.trim();
    }

    public String getAudiocard() {
        return audiocard;
    }

    public void setAudiocard(String audiocard) {
        this.audiocard = audiocard == null ? null : audiocard.trim();
    }

    public String getTimeremarks() {
        return timeremarks;
    }

    public void setTimeremarks(String timeremarks) {
        this.timeremarks = timeremarks == null ? null : timeremarks.trim();
    }
}