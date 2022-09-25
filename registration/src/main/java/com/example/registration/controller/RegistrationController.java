package com.example.registration.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.registration.model.Registration;
import com.example.registration.repository.RegistrationRepository;

@RestController
@RequestMapping(path="/registrations")
public class RegistrationController {

    @Autowired
    private RegistrationRepository registrationRepository;

    @PostMapping(path="/create")
    public @ResponseBody String addNewRegistration(@RequestBody Registration registration){
        registrationRepository.save(registration);
        return "Saved!";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Registration> getAllUsers() {
        // This returns a JSON or XML with the users
        return registrationRepository.findAll();
    }

    @GetMapping(path="/aluno")
    public @ResponseBody Iterable<Registration> getByIdAluno(@RequestParam("id") int id){
       return registrationRepository.findByIdAluno(id);
    }

    @GetMapping(path="/disciplina")
    public @ResponseBody Iterable<Registration> getByIdDisciplina(@RequestParam("id") int id){
       return registrationRepository.findByIdDisciplina(id);
    }


}
