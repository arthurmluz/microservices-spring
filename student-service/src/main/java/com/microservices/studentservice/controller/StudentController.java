package com.microservices.studentservice.controller;

import java.util.ArrayList;
import java.util.Optional;

import com.microservices.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    private StudentService studentService;

    @PostMapping(path="/create")
    public @ResponseBody ResponseEntity<Student> create(@RequestBody Student student){
        studentService.createStudent(student);
        return ResponseEntity.ok().body(student);
    }

    @GetMapping(path="/all")
    public @ResponseBody ResponseEntity<ArrayList<Student>> getAll() {
        ArrayList<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok().body(students);
    }

    @GetMapping
    public @ResponseBody Optional<Student> getById(@RequestParam("id") int id){
       return studentService.getStudent(id);
    }
}
