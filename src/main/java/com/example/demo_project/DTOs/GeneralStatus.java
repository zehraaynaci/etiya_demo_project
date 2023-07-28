package com.example.demo_project.DTOs;

import java.util.List;

public class GeneralStatus {
    private Long generalStatusId;
    private String name;
    private String description;
    private String shortCode;
    private String entityName;
    private String isActive;

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    private List<User> userList;
    private List<CustomerOrder> customerOrderList;
    private List<CustomerOrderCharacteristicValue> customerOrderCharacteristicValueList;

    public Long getGeneralStatusId() {
        return generalStatusId;
    }

    public void setGeneralStatusId(Long generalStatusId) {
        this.generalStatusId = generalStatusId;
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

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<CustomerOrder> getCustomerOrderList() {
        return customerOrderList;
    }

    public void setCustomerOrderList(List<CustomerOrder> customerOrderList) {
        this.customerOrderList = customerOrderList;
    }

    public List<CustomerOrderCharacteristicValue> getCustomerOrderCharacteristicValueList() {
        return customerOrderCharacteristicValueList;
    }

    public void setCustomerOrderCharacteristicValueList(List<CustomerOrderCharacteristicValue> customerOrderCharacteristicValueList) {
        this.customerOrderCharacteristicValueList = customerOrderCharacteristicValueList;
    }
}
