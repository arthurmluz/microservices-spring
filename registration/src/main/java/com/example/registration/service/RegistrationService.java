package com.example.registration.service;

import com.example.registration.exceptions.NotFoundException;
import com.example.registration.model.Registration;
import com.example.registration.repository.RegistrationRepository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private static RegistrationRepository registrationRepository;

    public Registration registrate(Registration Registration){
        try{
            return registrationRepository.save(Registration);
        }
        catch(Exception e){
            throw new DataIntegrityViolationException("Não foi possível realizar a Registration");
        }
    }

    public static Iterable<Registration> getRegistration(int idAluno){
        return registrationRepository.findByIdAluno(idAluno);//.orElseThrow(() -> new NotFoundException());
    }

    public void deleteRegistration(int id){
        registrationRepository.deleteById(id);
    }
}
