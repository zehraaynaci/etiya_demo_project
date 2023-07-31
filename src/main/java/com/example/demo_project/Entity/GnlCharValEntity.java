package com.example.demo_project.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "gnl_char_val")
public class GnlCharValEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gnl_char_val_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "char_id")
    private GnlCharEntity charId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "st_id")
    private GnlStEntity stId;

    @Column(name = "descr")
    private Long descr;

    @Column(name = "name")
    private Long name;

    @Column(name = "shrt_code")
    private Long shrtCode;

    @Column(name = "default_selected")
    private boolean defaultSelected;

    @Column(name = "val")
    private Long val;

    public Long getGnl_char_val_id() {
        return gnl_char_val_id;
    }

    public void setGnl_char_val_id(Long gnl_char_val_id) {
        this.gnl_char_val_id = gnl_char_val_id;
    }

    public GnlCharEntity getCharId() {
        return charId;
    }

    public void setCharId(GnlCharEntity charId) {
        this.charId = charId;
    }

    public GnlStEntity getStId() {
        return stId;
    }

    public void setStId(GnlStEntity stId) {
        this.stId = stId;
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

    public boolean isDefaultSelected() {
        return defaultSelected;
    }

    public void setDefaultSelected(boolean defaultSelected) {
        this.defaultSelected = defaultSelected;
    }

    public Long getVal() {
        return val;
    }

    public void setVal(Long val) {
        this.val = val;
    }
}
