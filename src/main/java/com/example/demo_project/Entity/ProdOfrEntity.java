package com.example.demo_project.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "prod_ofr")
public class ProdOfrEntity extends BaseEntity{
    @Id
    @Column(name = "prod_ofr_id")
    private Long prodOfrEntityId;

    @OneToMany(mappedBy = "prodOfrId", cascade = CascadeType.ALL)
    private List<ProdOfrCharValEntity> productOfferCharacterValueEntityList;

    @OneToMany(mappedBy = "prodOfrId", cascade = CascadeType.ALL)
    private List<CustOrdEntity> customerOrderEntityList;

    @Column(name = "name")
    private String name;
    @Column(name = "descr")
    private String descr;
    @Column(name = "is_actv")
    private Boolean isActv;

    public Long getProdOfrEntityId() {
        return prodOfrEntityId;
    }

    public void setProdOfrEntityId(Long prodOfrEntityId) {
        this.prodOfrEntityId = prodOfrEntityId;
    }

    public List<ProdOfrCharValEntity> getProductOfferCharacterValueEntityList() {
        return productOfferCharacterValueEntityList;
    }

    public void setProductOfferCharacterValueEntityList(List<ProdOfrCharValEntity> productOfferCharacterValueEntityList) {
        this.productOfferCharacterValueEntityList = productOfferCharacterValueEntityList;
    }

    public List<CustOrdEntity> getCustomerOrderEntityList() {
        return customerOrderEntityList;
    }

    public void setCustomerOrderEntityList(List<CustOrdEntity> customerOrderEntityList) {
        this.customerOrderEntityList = customerOrderEntityList;
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

    public Boolean getActv() {
        return isActv;
    }

    public void setActv(Boolean actv) {
        isActv = actv;
    }
}
