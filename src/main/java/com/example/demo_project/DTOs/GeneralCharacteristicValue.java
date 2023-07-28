package com.example.demo_project.DTOs;

public class GeneralCharacteristicValue {
    private Long generalCharacteristicValueId;
    private Long charId;
    private String name;
    private String description;
    private Boolean defaultSelected;
    private String shortCode;
    private String statusId;
    private String value;

    public Long getGeneralCharacteristicValueId() {
        return generalCharacteristicValueId;
    }

    public void setGeneralCharacteristicValueId(Long generalCharacteristicValueId) {
        this.generalCharacteristicValueId = generalCharacteristicValueId;
    }

    public Long getCharId() {
        return charId;
    }

    public void setCharId(Long charId) {
        this.charId = charId;
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

    public Boolean getDefaultSelected() {
        return defaultSelected;
    }

    public void setDefaultSelected(Boolean defaultSelected) {
        this.defaultSelected = defaultSelected;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
