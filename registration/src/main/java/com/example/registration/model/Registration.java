package com.example.registration.model;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import java.util.List;

@Entity
@Table(name="registration")
public class Registration {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private int idAluno;
    private int idDisciplina;

    public int getId() {
        return id;
    }


    public int getIdAluno() {
        return idAluno;
    }


    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }


    public int getIdDisciplina() {
        return idDisciplina;
    }


    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

}
