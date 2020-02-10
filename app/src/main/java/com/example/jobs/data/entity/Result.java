
package com.example.jobs.data.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("__CLASS__")
    @Expose
    private String cLASS;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("salary_min")
    @Expose
    private Double salaryMin;

    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("adref")
    @Expose
    private String adref;
    @SerializedName("company")
    @Expose
    private Company company;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("category")
    @Expose
    private Category category;
    @SerializedName("salary_max")
    @Expose
    private Double salaryMax;
    @SerializedName("redirect_url")
    @Expose
    private String redirectUrl;
    @SerializedName("salary_is_predicted")
    @Expose
    private String salaryIsPredicted;
    @SerializedName("contract_type")
    @Expose
    private String contractType;
    @SerializedName("contract_time")
    @Expose
    private String contractTime;

    public Double getSalaryMin() {
        return salaryMin;
    }

    public void setSalaryMin(Double salaryMin) {
        this.salaryMin = salaryMin;
    }

    public String getCLASS() {
        return cLASS;
    }

    public void setCLASS(String cLASS) {
        this.cLASS = cLASS;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdref() {
        return adref;
    }

    public void setAdref(String adref) {
        this.adref = adref;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Double getSalaryMax() {
        return salaryMax;
    }

    public void setSalaryMax(Double salaryMax) {
        this.salaryMax = salaryMax;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getSalaryIsPredicted() {
        return salaryIsPredicted;
    }

    public void setSalaryIsPredicted(String salaryIsPredicted) {
        this.salaryIsPredicted = salaryIsPredicted;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getContractTime() {
        return contractTime;
    }

    public void setContractTime(String contractTime) {
        this.contractTime = contractTime;
    }

}
