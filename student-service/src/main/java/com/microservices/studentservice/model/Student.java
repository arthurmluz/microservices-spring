package com.microservices.studentservice.model;

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
    private String docNumber;
    private String address;

    public String getUsername() {
        return username;
    }

    public Student(){

    }
    public Student(int id, String username, String docNumber, String address) {
        this.username = username;
        this.docNumber = docNumber;
        this.address = address;
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getid() {
        return id;
    }
}
