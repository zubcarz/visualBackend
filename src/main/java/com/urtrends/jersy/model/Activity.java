package com.urtrends.jersy.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Created by ZUBCARZ on 12/6/2016.
 */

@Generated("org.jsonschema2pojo")
public class Activity {

    @SerializedName("fecha")
    @Expose
    private String fecha;

    @SerializedName("WBSPath")
    @Expose
    private String WBSPath;

    @SerializedName("ActivityName")
    @Expose
    private String ActivityName;

    @SerializedName("TypeActivity")
    @Expose
    private String TypeActivity;

    @SerializedName("PV")
    @Expose
    private Long PV;

    @SerializedName("EV")
    @Expose
    private Long EV;

    @SerializedName("AC")
    @Expose
    private Long AC;

    @SerializedName("CPI")
    @Expose
    private float CPI;

    @SerializedName("SPI")
    @Expose
    private float SPI;

    @SerializedName("EVDesviation")
    @Expose
    private Long EVDesviation;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getWBSPath() {
        return WBSPath;
    }

    public void setWBSPath(String WBSPath) {
        this.WBSPath = WBSPath;
    }

    public String getActivityName() {
        return ActivityName;
    }

    public void setActivityName(String activityName) {
        ActivityName = activityName;
    }

    public String getTypeActivity() {
        return TypeActivity;
    }

    public void setTypeActivity(String typeActivity) {
        TypeActivity = typeActivity;
    }

    public Long getPV() {
        return PV;
    }

    public void setPV(Long PV) {
        this.PV = PV;
    }

    public Long getEV() {
        return EV;
    }

    public void setEV(Long EV) {
        this.EV = EV;
    }

    public Long getAC() {
        return AC;
    }

    public void setAC(Long AC) {
        this.AC = AC;
    }

    public float getCPI() {
        return CPI;
    }

    public void setCPI(float CPI) {
        this.CPI = CPI;
    }

    public float getSPI() {
        return SPI;
    }

    public void setSPI(float SPI) {
        this.SPI = SPI;
    }

    public Long getEVDesviation() {
        return EVDesviation;
    }

    public void setEVDesviation(Long EVDesviation) {
        this.EVDesviation = EVDesviation;
    }
}
