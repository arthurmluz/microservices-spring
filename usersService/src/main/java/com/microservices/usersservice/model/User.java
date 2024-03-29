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
    private String email;
    private boolean logado;
    
    public int getId() {
        return id;
    }
    public void setLogado(boolean logado){
        this.logado = logado;
    }

    public boolean getLogado(){
        return this.logado;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }  

}
