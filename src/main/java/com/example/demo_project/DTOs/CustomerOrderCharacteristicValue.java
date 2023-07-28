package com.example.demo_project.DTOs;

public class CustomerOrderCharacteristicValue {
    private Long customerOrderCharacteristicValueId;
    private String value;
    private Long customerOrderCharacteristicStatusId;
    private Long customerOrderId;

    public Long getCustomerOrderCharacteristicValueId() {
        return customerOrderCharacteristicValueId;
    }

    public void setCustomerOrderCharacteristicValueId(Long customerOrderCharacteristicValueId) {
        this.customerOrderCharacteristicValueId = customerOrderCharacteristicValueId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getCustomerOrderCharacteristicStatusId() {
        return customerOrderCharacteristicStatusId;
    }

    public void setCustomerOrderCharacteristicStatusId(Long customerOrderCharacteristicStatusId) {
        this.customerOrderCharacteristicStatusId = customerOrderCharacteristicStatusId;
    }

    public Long getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerOrderId(Long customerOrderId) {
        this.customerOrderId = customerOrderId;
    }
}
