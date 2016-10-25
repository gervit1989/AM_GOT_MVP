package com.skillbranch.sb_got_mvp.data.network.res;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zver on 17.10.2016.
 */
public class HouseModelResponse {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("coatOfArms")
    @Expose
    private String coatOfArms;
    @SerializedName("words")
    @Expose
    private String words;
    @SerializedName("titles")
    @Expose
    private List<String> titles = new ArrayList<>();
    @SerializedName("seats")
    @Expose
    private List<String> seats = new ArrayList<>();
    @SerializedName("currentLord")
    @Expose
    private String currentLord;
    @SerializedName("heir")
    @Expose
    private String heir;
    @SerializedName("overlord")
    @Expose
    private String overlord;
    @SerializedName("founded")
    @Expose
    private String founded;

    @SerializedName("founder")
    @Expose
    private String founder;
    @SerializedName("diedOut")
    @Expose
    private String diedOut;
    @SerializedName("ancestralWeapons")
    @Expose
    private List<String> ancestralWeapons = new ArrayList<>();
    @SerializedName("cadetBranches")
    @Expose
    private List<String> cadetBranches = new ArrayList<>();
    @SerializedName("swornMembers")
    @Expose
    private List<String> swornMembers = new ArrayList<>();


    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getCoatOfArms() {
        return coatOfArms;
    }

    public String getWords() {
        return words;
    }

    public List<String> getTitles() {
        return titles;
    }

    public List<String> getSeats() {
        return seats;
    }

    public String getCurrentLord() {
        return currentLord;
    }

    public String getHeir() {
        return heir;
    }

    public String getOverlord() {
        return overlord;
    }

    public String getFounded() {
        return founded;
    }

    public String getFounder() {
        return founder;
    }

    public String getDiedOut() {
        return diedOut;
    }

    public List<String> getAncestralWeapons() {
        return ancestralWeapons;
    }

    public List<String> getCadetBranches() {
        return cadetBranches;
    }

    public List<String> getSwornMembers() {
        return swornMembers;
    }
}
