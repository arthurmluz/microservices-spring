package com.microservices.usersservice.model;

import javax.persistence.*;


@Entity
@Table(name= "user")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;

    private String name;
    private String senha;
    
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    

}
