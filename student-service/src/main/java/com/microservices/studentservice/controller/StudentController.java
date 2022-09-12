package com.microservices.studentservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.studentservice.model.Student;
import com.microservices.studentservice.repository.StudentRepository;

@RestController
@RequestMapping(path="/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/test")
    public Student getAllStudents(){
        return new Student("Dani","1111","Rua X",0);
    }

    @PostMapping(path="/create")
    public @ResponseBody String addNewSubject(@RequestBody Student student){
        ((Object) studentRepository).save(student);
        return "Saved!";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Student> getAllUsers() {
        // This returns a JSON or XML with the users
        return studentRepository.findAll();
    }

    @GetMapping
    public @ResponseBody Optional<Student> getById(@RequestParam("registration") int registration){
        return studentRepository.findById(registration);
    }
}
