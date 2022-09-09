package com.microservices.studentservice.model;

public class Student {
    private String username;
    private String docNumber;
    private String address;
    private String registration; // numero de matricula

    public String getUsername() {
        return username;
    }

    public Student(String username, String docNumber, String address, String registration) {
        super();
        this.username = username;
        this.docNumber = docNumber;
        this.address = address;
        this.registration = registration;
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
