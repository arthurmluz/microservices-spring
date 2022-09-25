package com.microservices.studentservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "student")
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;

    private String username;
    @Column(unique=true)
    private String docNumber;
    private String address;


    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDocNumber() {
        return this.docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getid() {
        return id;
    }
}
