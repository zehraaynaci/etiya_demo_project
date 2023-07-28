package com.example.demo_project.DTOs;

public class ProductOfferCharacteristicValue {
    private Long productOfferCharacteristicId;
    private Long productOfferId;
    private String name;
    private String description;
    private String value;
    private Boolean isActive;

    public Long getProductOfferCharacteristicId() {
        return productOfferCharacteristicId;
    }

    public void setProductOfferCharacteristicId(Long productOfferCharacteristicId) {
        this.productOfferCharacteristicId = productOfferCharacteristicId;
    }

    public Long getProductOfferId() {
        return productOfferId;
    }

    public void setProductOfferId(Long productOfferId) {
        this.productOfferId = productOfferId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
