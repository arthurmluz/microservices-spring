package com.microservices.subjectsservice.model;

import javax.persistence.*;


@Entity
@Table(name= "subject")
public class Subject {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;

    private String codigo;
    private String name;
    private String class_time;
    private int turma;

    public int getId() {
        return id;
    }

    public int getTurma() {
        return turma;
    }

    public String getClass_time() {
        return class_time;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClass_time(String class_time) {
        this.class_time = class_time;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }
}
