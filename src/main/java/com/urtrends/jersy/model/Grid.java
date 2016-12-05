package com.urtrends.jersy.model;

/**
 * Created by ZUBCARZ on 2/27/2016.
 */
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Grid {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("feature")
    @Expose
    private String feature;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("urlphoto")
    @Expose
    private String urlphoto;

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
     * @return The username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username The username
     */
    public void setUsername(String username) {
        this.username = username;
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
     * @return The feature
     */
    public String getFeature() {
        return feature;
    }

    /**
     * @param feature The feature
     */
    public void setFeature(String feature) {
        this.feature = feature;
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
     * @return The urlphoto
     */
    public String getUrlphoto() {
        return urlphoto;
    }

    /**
     * @param urlphoto The urlphoto
     */
    public void setUrlphoto(String urlphoto) {
        this.urlphoto = urlphoto;
    }
}