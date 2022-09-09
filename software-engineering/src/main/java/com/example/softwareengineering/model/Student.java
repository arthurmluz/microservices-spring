package com.example.softwareengineering.model;

public class Student {

    private String username;
    private String docNumber;
    private String address;
    private String registration; // numero de matricula

    public String getUsername() {
        return username;
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

    public String getRegistration() {
        return registration;
    }
}
