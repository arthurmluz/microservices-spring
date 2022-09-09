package com.microservices.studentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.studentservice.model.Student;

@RestController
public class StudentController {

    @GetMapping("/allStudents")
    public Student getAllStudents(){
        return new Student("Dani","1111","Rua X","2222");
    }
}
