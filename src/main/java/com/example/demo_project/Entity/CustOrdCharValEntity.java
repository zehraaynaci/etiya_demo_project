package com.example.demo_project.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cust_ord_char_val")
public class CustOrdCharValEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long custOrdCharValId;

    @Column(name = "val")
    private String val;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cust_ord_char_st_id")
    private GnlStEntity custOrdCharStId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cust_ord_id")
    private CustOrdEntity custOrdId;


    public Long getCustOrdCharValId() {
        return custOrdCharValId;
    }

    public void setCustOrdCharValId(Long custOrdCharValId) {
        this.custOrdCharValId = custOrdCharValId;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public GnlStEntity getCustOrdCharStId() {
        return custOrdCharStId;
    }

    public void setCustOrdCharStId(GnlStEntity custOrdCharStId) {
        this.custOrdCharStId = custOrdCharStId;
    }

    public CustOrdEntity getCustOrdId() {
        return custOrdId;
    }

    public void setCustOrdId(CustOrdEntity custOrdId) {
        this.custOrdId = custOrdId;
    }
}
