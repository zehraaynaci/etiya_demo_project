package com.example.demo_project.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "gnl_st")
public class GnlStEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gnlStId;

    //mapped by içine yazdıklarım uyanlış olabilir???
    @OneToMany(mappedBy = "gnlStId", cascade = CascadeType.ALL)
    private List<UserEntity> userEntityList;
    @OneToMany(mappedBy = "custOrdStId", cascade = CascadeType.ALL)
    private List<CustOrdEntity> customerOrderEntityList;
    @OneToMany(mappedBy = "custOrdCharStId", cascade = CascadeType.ALL)
    private List<CustOrdCharValEntity> customerOrderCharacterValueEntityList;

    @Column(name = "name")
    private String name;
    @Column(name = "descr")
    private String descr;
    @Column(name = "shrt_code")
    private String shrtCode;
    @Column(name = "ent_name")
    private String entName;
    @Column(name = "is_Actv")
    private String isActv;



    public Long getGnlStId() {
        return gnlStId;
    }

    public void setGnlStId(Long gnlStId) {
        this.gnlStId = gnlStId;
    }

    public List<UserEntity> getUserEntityList() {
        return userEntityList;
    }

    public void setUserEntityList(List<UserEntity> userEntityList) {
        this.userEntityList = userEntityList;
    }

    public List<CustOrdEntity> getCustomerOrderEntityList() {
        return customerOrderEntityList;
    }

    public void setCustomerOrderEntityList(List<CustOrdEntity> customerOrderEntityList) {
        this.customerOrderEntityList = customerOrderEntityList;
    }

    public List<CustOrdCharValEntity> getCustomerOrderCharacterValueEntityList() {
        return customerOrderCharacterValueEntityList;
    }

    public void setCustomerOrderCharacterValueEntityList(List<CustOrdCharValEntity> customerOrderCharacterValueEntityList) {
        this.customerOrderCharacterValueEntityList = customerOrderCharacterValueEntityList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getShrtCode() {
        return shrtCode;
    }

    public void setShrtCode(String shrtCode) {
        this.shrtCode = shrtCode;
    }

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }
    public String getIsActv() {
        return isActv;
    }

    public void setIsActv(String isActv) {
        this.isActv = isActv;
    }
}
