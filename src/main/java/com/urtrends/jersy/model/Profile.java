package com.urtrends.jersy.model;

/**
 * Created by ZUBCARZ on 2/27/2016.
 */


import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Profile {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("urpin")
    @Expose
    private String urpin;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("urlPhoto")
    @Expose
    private String urlPhoto;
    @SerializedName("urlCover")
    @Expose
    private String urlCover;
    @SerializedName("socialnetwork")
    @Expose
    private List<Socialnetwork> socialnetwork = new ArrayList<Socialnetwork>();

    /**
     * @return The id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return The urpin
     */
    public String getUrpin() {
        return urpin;
    }

    /**
     * @param urpin The urpin
     */
    public void setUrpin(String urpin) {
        this.urpin = urpin;
    }

    /**
     * @return The bio
     */
    public String getBio() {
        return bio;
    }

    /**
     * @param bio The bio
     */
    public void setBio(String bio) {
        this.bio = bio;
    }

    /**
     * @return The website
     */
    public String getWebsite() {
        return website;
    }

    /**
     * @param website The website
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * @return The urlPhoto
     */
    public String getUrlPhoto() {
        return urlPhoto;
    }

    /**
     * @param urlPhoto The urlPhoto
     */
    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    /**
     * @return The urlCover
     */
    public String getUrlCover() {
        return urlCover;
    }

    /**
     * @param urlCover The urlCover
     */
    public void setUrlCover(String urlCover) {
        this.urlCover = urlCover;
    }

    /**
     * @return The socialnetwork
     */
    public List<Socialnetwork> getSocialnetwork() {
        return socialnetwork;
    }

    /**
     * @param socialnetwork The socialnetwork
     */
    public void setSocialnetwork(List<Socialnetwork> socialnetwork) {
        this.socialnetwork = socialnetwork;
    }

}