
package com.example.jobs.data.entity;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JobsEntity {

    @SerializedName("results")
    @Expose
    private List<Result> results = null;
    @SerializedName("__CLASS__")
    @Expose
    private String cLASS;
    @SerializedName("mean")
    @Expose
    private Double mean;
    @SerializedName("count")
    @Expose
    private Integer count;

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public String getCLASS() {
        return cLASS;
    }

    public void setCLASS(String cLASS) {
        this.cLASS = cLASS;
    }

    public Double getMean() {
        return mean;
    }

    public void setMean(Double mean) {
        this.mean = mean;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
