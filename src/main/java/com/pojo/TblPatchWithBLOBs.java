package com.pojo;

public class TblPatchWithBLOBs extends TblPatch {
    private String os;

    private String patchintroduction;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os == null ? null : os.trim();
    }

    public String getPatchintroduction() {
        return patchintroduction;
    }

    public void setPatchintroduction(String patchintroduction) {
        this.patchintroduction = patchintroduction == null ? null : patchintroduction.trim();
    }
}