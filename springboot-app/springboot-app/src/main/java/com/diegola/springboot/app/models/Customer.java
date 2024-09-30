package com.diegola.springboot.app.models;

import lombok.Getter;
import lombok.Setter;

public class Customer {
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String telphone;
    @Getter @Setter
    private String email;
    @Getter @Setter
    private String address;

    public Customer(){
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
