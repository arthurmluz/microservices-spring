package com.example.registration.service;

import com.example.registration.exceptions.NotFoundException;
import com.example.registration.model.Matricula;
import com.example.registration.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class MatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    public Matricula registrate(Matricula matricula){
        try{
            return matriculaRepository.save(matricula);
        }
        catch(Exception e){
            throw new DataIntegrityViolationException("Não foi possível realizar a matricula");
        }
    }

    public Matricula getRegistration(int idAluno){
        return matriculaRepository.findById(idAluno).orElseThrow(() -> new NotFoundException());
    }


}
