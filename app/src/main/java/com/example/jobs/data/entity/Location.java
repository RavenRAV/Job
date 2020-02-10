
package com.example.jobs.data.entity;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Location {

    @SerializedName("area")
    @Expose
    private List<String> area = null;
    @SerializedName("__CLASS__")
    @Expose
    private String cLASS;
    @SerializedName("display_name")
    @Expose
    private String displayName;

    public List<String> getArea() {
        return area;
    }

    public void setArea(List<String> area) {
        this.area = area;
    }

    public String getCLASS() {
        return cLASS;
    }

    public void setCLASS(String cLASS) {
        this.cLASS = cLASS;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

}
