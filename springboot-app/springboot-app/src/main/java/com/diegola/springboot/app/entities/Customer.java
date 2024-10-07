package com.diegola.springboot.app.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table (name="customer")
public class Customer implements Serializable {

    //@Id
    //@GeneratedValue(strategy= GenerationType.IDENTITY);
    private Integer id;
    private String name;
    private String telphone;
    private String email;
    private String address;


    @Column(name="create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
