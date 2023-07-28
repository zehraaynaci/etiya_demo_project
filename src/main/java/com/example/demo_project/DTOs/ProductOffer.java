package com.example.demo_project.DTOs;

import java.util.List;

public class ProductOffer {
    private Long productOfferId;
    private String name;
    private String description;
    private Boolean isActive;

    private List<ProductOfferCharacteristicValue> productOfferCharacteristicValueList;
    private List<CustomerOrder>customerOrderList;

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

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public List<ProductOfferCharacteristicValue> getProductOfferCharacteristicValueList() {
        return productOfferCharacteristicValueList;
    }

    public void setProductOfferCharacteristicValueList(List<ProductOfferCharacteristicValue> productOfferCharacteristicValueList) {
        this.productOfferCharacteristicValueList = productOfferCharacteristicValueList;
    }

    public List<CustomerOrder> getCustomerOrderList() {
        return customerOrderList;
    }

    public void setCustomerOrderList(List<CustomerOrder> customerOrderList) {
        this.customerOrderList = customerOrderList;
    }
}
