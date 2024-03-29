package com.microservices.studentservice.service;

import com.microservices.studentservice.exceptions.NotFoundException;
import com.microservices.studentservice.model.Student;
import com.microservices.studentservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student createStudent(Student student){
        try {
           return studentRepository.save(student);
        }
        catch (Exception e){
            throw new DataIntegrityViolationException("Nao foi possivel criar o estudante");
        }
    }

    public Student getStudent(int id){
       return studentRepository.findById(id).orElseThrow(() -> new NotFoundException());
    }

    public Iterable<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public ArrayList<Student> getStudentsByName(String username){
        return studentRepository.findByUsernameContains(username);
    }

    public Optional<Student> getStudentsByDocNumber(String username){
        return studentRepository.findByDocNumber(username);
    }


    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }

    public void deleteStudent(int id){
        studentRepository.deleteById(id);
    }
}
