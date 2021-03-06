package com.example.machine_time.googlebooks.net.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SaleInfo {
    @SerializedName("country")
    private String country;
    @SerializedName("saleability")
    private String saleability;
    @SerializedName("isEbook")
    private Boolean isEbook;
    @SerializedName("listPrice")
    private ListPrice listPrice;
    @SerializedName("retailPrice")
    private RetailPrice retailPrice;
    @SerializedName("buyLink")
    private String buyLink;
    @SerializedName("offers")
    private List<Offer> offers = null;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSaleability() {
        return saleability;
    }

    public void setSaleability(String saleability) {
        this.saleability = saleability;
    }

    public Boolean getIsEbook() {
        return isEbook;
    }

    public void setIsEbook(Boolean isEbook) {
        this.isEbook = isEbook;
    }

    public ListPrice getListPrice() {
        return listPrice;
    }

    public void setListPrice(ListPrice listPrice) {
        this.listPrice = listPrice;
    }

    public RetailPrice getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(RetailPrice retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getBuyLink() {
        return buyLink;
    }

    public void setBuyLink(String buyLink) {
        this.buyLink = buyLink;
    }

    public List<Offer> getOffers() {
        return offers;
    }

    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }
}
