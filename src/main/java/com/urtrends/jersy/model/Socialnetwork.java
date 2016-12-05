package com.urtrends.jersy.model;

/**
 * Created by ZUBCARZ on 2/27/2016.
 */

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Socialnetwork {

    @SerializedName("provider")
    @Expose
    private String provider;
    @SerializedName("idSocialNetwork")
    @Expose
    private String idSocialNetwork;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("urlProfile")
    @Expose
    private String urlProfile;
    @SerializedName("status")
    @Expose
    private String status;

    public Socialnetwork(String status, String provider, String idSocialNetwork, String username, String urlProfile) {
        this.status = status;
        this.provider = provider;
        this.idSocialNetwork = idSocialNetwork;
        this.username = username;
        this.urlProfile = urlProfile;
    }

    /**
     * @return The provider
     */
    public String getProvider() {
        return provider;
    }

    /**
     * @param provider The provider
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * @return The idSocialNetwork
     */
    public String getIdSocialNetwork() {
        return idSocialNetwork;
    }

    /**
     * @param idSocialNetwork The idSocialNetwork
     */
    public void setIdSocialNetwork(String idSocialNetwork) {
        this.idSocialNetwork = idSocialNetwork;
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
     * @return The urlProfile
     */
    public String getUrlProfile() {
        return urlProfile;
    }

    /**
     * @param urlProfile The urlProfile
     */
    public void setUrlProfile(String urlProfile) {
        this.urlProfile = urlProfile;
    }

    /**
     * @return The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    public void setStatus(String status) {

        this.status = status;
    }
}