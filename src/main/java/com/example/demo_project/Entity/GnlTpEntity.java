package com.example.demo_project.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "gnl_tp")
public class GnlTpEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gnlTpId;

    @OneToMany(mappedBy = "userTpId", cascade = CascadeType.ALL)
    private List<UserEntity> userEntityList;

    @Column(name = "name")
    private String name;
    @Column(name = "descr")
    private String descr;
    @Column(name = "shrt_code")
    private String shrtCode;
    @Column(name = "ent_code_name")
    private String entCodeName;
    @Column(name = "is_actv")
    private String isActv;

    public Long getGnlTpId() {
        return gnlTpId;
    }

    public void setGnlTpId(Long gnlTpId) {
        this.gnlTpId = gnlTpId;
    }

    public List<UserEntity> getUserEntityList() {
        return userEntityList;
    }

    public void setUserEntityList(List<UserEntity> userEntityList) {
        this.userEntityList = userEntityList;
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

    public String getEndCodeName() {
        return entCodeName;
    }

    public void setEndCodeName(String endCodeName) {
        this.entCodeName = endCodeName;
    }

    public String getIsActv() {
        return isActv;
    }

    public void setIsActv(String isActv) {
        this.isActv = isActv;
    }
}
