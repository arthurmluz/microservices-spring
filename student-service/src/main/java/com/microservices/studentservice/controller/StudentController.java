package com.microservices.studentservice.controller;

import java.util.ArrayList;
import java.util.Optional;

import com.microservices.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path="/{id}")
    public @ResponseBody ResponseEntity<Student> getById(@PathVariable int id){
       return ResponseEntity.ok().body(studentService.getStudent(id));
    }

    @DeleteMapping(path="/{id}")
    public void delete(@PathVariable int id){
        studentService.deleteStudent(id);
    }
}
