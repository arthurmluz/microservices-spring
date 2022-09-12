package com.microservices.subjectsservice.controller;

import com.microservices.subjectsservice.model.Subject;
import com.microservices.subjectsservice.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path="/subject")
public class SubjectController {

    @Autowired
    private SubjectRepository subjectRepository;

    @PostMapping(path="/create")
    public @ResponseBody String addNewSubject(@RequestBody Subject subject){
        subjectRepository.save(subject);
        return "Saved!";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Subject> getAllUsers() {
        // This returns a JSON or XML with the users
        return subjectRepository.findAll();
    }

    @GetMapping
    public @ResponseBody Optional<Subject> getById(@RequestParam("id") int id){
        return subjectRepository.findById(id);
    }

}
