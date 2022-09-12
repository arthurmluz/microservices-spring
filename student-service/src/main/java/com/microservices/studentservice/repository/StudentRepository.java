package com.microservices.studentservice.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservices.studentservice.controller.Subject;
import com.microservices.studentservice.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

    Optional<Student> findById(int registration);

    Iterable<Student> findAll();
    
}
