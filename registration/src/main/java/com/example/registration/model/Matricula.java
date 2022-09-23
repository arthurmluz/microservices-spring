package com.example.registration.model;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Matricula {

    @Id
    private int id;
    private int idAluno;
    @ElementCollection
    private List<String> disciplinas;


    public Matricula(int idAluno, List<String> disciplinas) {
        this.idAluno = idAluno;
        this.disciplinas = disciplinas;
    }

    public Matricula(){

    }
}
