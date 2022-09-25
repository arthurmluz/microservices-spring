package com.microservices.usersservice.repository;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.microservices.usersservice.model.User;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    Optional<User> findByName(String name);
}