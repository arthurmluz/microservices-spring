package com.microservices.studentservice.repository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.microservices.studentservice.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

    Optional<Student> findById(int id);
    ArrayList<Student> findByUsernameContains(String username);
    Optional<Student> findByDocNumber(String docNumber);
    
}
