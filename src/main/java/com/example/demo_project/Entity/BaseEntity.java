package com.example.demo_project.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import java.time.LocalDate;

@MappedSuperclass
//Base classtaki özellikleri yazmadan aktarım sağlamak için
public abstract class BaseEntity {


    @Column(name = "cdate")
    private LocalDate cdate;
    @Column(name = "cuser")
    private String cuser;
    @Column(name = "udate")
    private LocalDate udate;
    @Column(name = "uuser")
    private String uuser;

    public LocalDate getCdate() {

        return cdate;
    }

    public void setCdate(LocalDate cdate) {

        this.cdate = cdate;
    }

    public String getCuser() {

        return cuser;
    }

    public void setCuser(String cuser) {

        this.cuser = cuser;
    }

    public LocalDate getUudate() {

        return udate;
    }

    public void setUudate(LocalDate uudate) {

        this.udate = uudate;
    }

    public String getUuser() {

        return uuser;
    }

    public void setUuser(String uuser) {

        this.uuser = uuser;
    }
}
