package com.example.demo_project.Entity;

import jakarta.persistence.*;

//relations?
@Entity
@Table(name = "gnl_char")
public class GnlCharEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gnl_char_id;

    @Column(name = "descr")
    private Long descr;

    @Column(name = "name")
    private Long name;

    @Column(name = "shrt_code")
    private Long shrtCode;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "st_id")
    private GnlStEntity stId;

    public Long getGnl_char_id() {
        return gnl_char_id;
    }

    public void setGnl_char_id(Long gnl_char_id) {
        this.gnl_char_id = gnl_char_id;
    }

    public Long getDescr() {
        return descr;
    }

    public void setDescr(Long descr) {
        this.descr = descr;
    }

    public Long getName() {
        return name;
    }

    public void setName(Long name) {
        this.name = name;
    }

    public Long getShrtCode() {
        return shrtCode;
    }

    public void setShrtCode(Long shrtCode) {
        this.shrtCode = shrtCode;
    }

    public GnlStEntity getStId() {
        return stId;
    }

    public void setStId(GnlStEntity stId) {
        this.stId = stId;
    }
}
