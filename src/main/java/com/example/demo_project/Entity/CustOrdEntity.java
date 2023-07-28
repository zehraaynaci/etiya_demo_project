package com.example.demo_project.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cust_ord")
public class CustOrdEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long custOrdId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cust_ord_id")
    private CustOrdCharValEntity custOrdCharVal;
    //join column? olmasa mı

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prod_ofr_id")
    private ProdOfrEntity prodOfrId;


    //Foreign Key: User -> user_id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private UserEntity userId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cust_ord_st_id")
    private GnlStEntity custOrdStId;

    public Long getCustOrdId() {
        return custOrdId;
    }

    public void setCustOrdId(Long custOrdId) {
        this.custOrdId = custOrdId;
    }

    public CustOrdCharValEntity getCustOrdCharVal() {
        return custOrdCharVal;
    }

    public void setCustOrdCharVal(CustOrdCharValEntity custOrdCharVal) {
        this.custOrdCharVal = custOrdCharVal;
    }

    public ProdOfrEntity getProdOfrId() {
        return prodOfrId;
    }

    public void setProdOfrId(ProdOfrEntity prodOfrId) {
        this.prodOfrId = prodOfrId;
    }

    public UserEntity getUserId() {
        return userId;
    }

    public void setUserId(UserEntity userId) {
        this.userId = userId;
    }

    public GnlStEntity getCustOrdStId() {
        return custOrdStId;
    }

    public void setCustOrdStId(GnlStEntity custOrdStId) {
        this.custOrdStId = custOrdStId;
    }
}


