package com.example.registration.repository;

import com.example.registration.model.Registration;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends CrudRepository<Registration, Integer> {

    Iterable<Registration> findByIdAluno(int idAluno);
    Iterable<Registration> findByIdDisciplina(int idDisciplina);
}
