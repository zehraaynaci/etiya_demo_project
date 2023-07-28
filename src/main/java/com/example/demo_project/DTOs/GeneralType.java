package com.example.demo_project.DTOs;

import java.util.List;

public class GeneralType {
    private Long generalTypeId;
    private String name;
    private String description;
    private String shortCode;
    private String entityCodeName;
    private Boolean isActive;


    private List<User> userList;

    public Long getGeneralTypeId() {
        return generalTypeId;
    }

    public void setGeneralTypeId(Long generalTypeId) {
        this.generalTypeId = generalTypeId;
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

    public String getEntityCodeName() {
        return entityCodeName;
    }

    public void setEntityCodeName(String entityCodeName) {
        this.entityCodeName = entityCodeName;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
