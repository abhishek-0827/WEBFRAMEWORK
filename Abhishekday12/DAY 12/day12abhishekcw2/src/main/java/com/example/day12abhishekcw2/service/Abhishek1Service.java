package com.example.day12abhishekcw2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day12abhishekcw2.model.AbhishekStudent;
import com.example.day12abhishekcw2.repository.Abhishek1Repository;


@Service
public class Abhishek1Service {
    @Autowired
    Abhishek1Repository studentRepository;
    public AbhishekStudent addStudents(AbhishekStudent student)
    {
        return studentRepository.save(student);
    }
    public List<AbhishekStudent>getStudent()
    {
        return studentRepository.findAll();
    }
    public List<AbhishekStudent>getStudentInner()
    {
        return studentRepository.getStudentInner();
    }
    public List<AbhishekStudent>getStudentLeftOuter()
    {
        return studentRepository.getStudentsLeftOuter();
    }
    
}
