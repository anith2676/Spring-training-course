package com.example.model;

import java.io.Serializable;

public class Learner implements Serializable {


    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;

    public Learner() {}

    public Learner(String name, String email, String password, String phone, String address) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Learner{" + "name='" + name + '\'' + ", email='" + email + '\'' + ", password='"
                + password + '\'' + ", phone='" + phone + '\'' + ", address='" + address + '\''
                + '}';
    }

}
