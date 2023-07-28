package com.example.demo_project.DTOs;

import java.util.List;

public class User {

    private Long userId;
    private String screenName;
    private String password;
    private String userName;
    private Long statusId;
    private GeneralType userType;

    //one to many ilişkisi dönenlerde liste açıyoruz
    //liste açarken generic mantığı ile açıyoruz
    //listenin içine many kısmı nereye gidiyorsa
    // o sınıfı yazıyoruz
    private List<CustomerOrder> customerOrderList;

    public Long getUserId() {

        return userId;
    }

    public void setUserId(Long userId) {

        this.userId = userId;
    }

    public String getScreenName() {

        return screenName;
    }

    public void setScreenName(String screenName) {

        this.screenName = screenName;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {

        this.userName = userName;
    }

    public Long getStatusId() {

        return statusId;
    }

    public void setStatusId(Long statusId) {

        this.statusId = statusId;
    }

    public GeneralType getUserType() {

        return userType;
    }

    public void setUserType(GeneralType userType) {

        this.userType = userType;
    }

    public List<CustomerOrder> getCustomerOrderList() {

        return customerOrderList;
    }

    public void setCustomerOrderList(List<CustomerOrder> customerOrderList) {
        this.customerOrderList = customerOrderList;
    }
}
