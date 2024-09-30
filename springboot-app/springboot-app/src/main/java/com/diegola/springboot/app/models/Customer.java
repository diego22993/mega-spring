package com.diegola.springboot.app.models;


public class Customer {
    private String name;
    private String telphone;
    private String email;
    private String address;

    public String getName() {
        return name;
    }

    public String getTelphone() {
        return telphone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public Customer(){
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer(String name, String telphone, String email, String address) {
        this.name = name;
        this.telphone = telphone;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", telphone=" + telphone +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
