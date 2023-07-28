package com.example.demo_project.Request;

//API'nin request kısmını yazıyoruz
//request, response nesneleri- api için istek cevap
public class CreateUserRequest {

    private String name;
    private String pwd;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getPwd() {

        return pwd;
    }

    public void setPwd(String pwd) {

        this.pwd = pwd;
    }


}
