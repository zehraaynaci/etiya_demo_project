package com.example.demo_project.DTOs;

public class CustomerOrder {
    private Long customerOrderId;
    private Long productOfferId;
    private Long userId;

    public Long getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerOrderId(Long customerOrderId) {
        this.customerOrderId = customerOrderId;
    }

    public Long getProductOfferId() {
        return productOfferId;
    }

    public void setProductOfferId(Long productOfferId) {
        this.productOfferId = productOfferId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCustomerOrderStatusId() {
        return customerOrderStatusId;
    }

    public void setCustomerOrderStatusId(Long customerOrderStatusId) {
        this.customerOrderStatusId = customerOrderStatusId;
    }

    private Long customerOrderStatusId;


}
