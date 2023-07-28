package com.example.demo_project.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL)
    private List<CustOrdEntity> customerOrderEntityList;
    @Column(name = "scr_name")
    private String scrName;
    @Column(name = "pwd")
    private String pwd;
    @Column(name = "uname")
    private String uname;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "st_id")
    private GnlStEntity gnlStId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_tp_id")
    private GnlTpEntity userTpId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<CustOrdEntity> getCustomerOrderEntityList() {
        return customerOrderEntityList;
    }

    public void setCustomerOrderEntityList(List<CustOrdEntity> customerOrderEntityList) {
        this.customerOrderEntityList = customerOrderEntityList;
    }

    public String getScrName() {
        return scrName;
    }

    public void setScrName(String scrName) {
        this.scrName = scrName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public GnlStEntity getGnlStId() {
        return gnlStId;
    }

    public void setGnlStId(GnlStEntity gnlStId) {
        this.gnlStId = gnlStId;
    }

    public GnlTpEntity getUserTpId() {
        return userTpId;
    }

    public void setUserTpId(GnlTpEntity userTpId) {
        this.userTpId = userTpId;
    }
}
