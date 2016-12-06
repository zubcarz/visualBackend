package com.urtrends.jersy.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Created by ZUBCARZ on 12/6/2016.
 */
public class PathActivity {
    @SerializedName("WBSPath")
    @Expose
    private String WBSPath;
    @SerializedName("WBSName")
    @Expose
    private String WBSName;
    @SerializedName("WBSPadre")
    @Expose
    private String WBSPadre;

    public String getWBSPath() {
        return WBSPath;
    }

    public void setWBSPath(String WBSPath) {
        this.WBSPath = WBSPath;
    }

    public String getWBSName() {
        return WBSName;
    }

    public void setWBSName(String WBSName) {
        this.WBSName = WBSName;
    }

    public String getWBSPadre() {
        return WBSPadre;
    }

    public void setWBSPadre(String WBSPadre) {
        this.WBSPadre = WBSPadre;
    }
}
