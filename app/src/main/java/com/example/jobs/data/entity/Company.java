
package com.example.jobs.data.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Company {

    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("__CLASS__")
    @Expose
    private String cLASS;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getCLASS() {
        return cLASS;
    }

    public void setCLASS(String cLASS) {
        this.cLASS = cLASS;
    }

}
