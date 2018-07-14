package com.pojo;

public class TblComputer {
    private String equipmentid;

    private String graphiccard;

    private String audiocard;

    private String networkcard;

    private String motherboard;

    private String osname;

    private String osid;

    public String getEquipmentid() {
        return equipmentid;
    }

    public void setEquipmentid(String equipmentid) {
        this.equipmentid = equipmentid == null ? null : equipmentid.trim();
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

    public String getOsid() {
        return osid;
    }

    public void setOsid(String osid) {
        this.osid = osid == null ? null : osid.trim();
    }
}