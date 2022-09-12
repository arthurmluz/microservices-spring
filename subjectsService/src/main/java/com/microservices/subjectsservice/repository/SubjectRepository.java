package com.microservices.subjectsservice.repository;


import org.springframework.data.repository.CrudRepository;

import com.microservices.subjectsservice.model.Subject;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface SubjectRepository extends CrudRepository<Subject, Integer> {

}