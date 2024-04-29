package com.example.day12abhishekcw2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.day12abhishekcw2.model.AbhishekStudent;
import com.example.day12abhishekcw2.service.Abhishek1Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class AbhishekStudentController{
    @Autowired
    Abhishek1Service studentService;
    @PostMapping("/student")
    public ResponseEntity<AbhishekStudent> addStudents(@RequestBody AbhishekStudent student)
    {
        return new ResponseEntity<>(studentService.addStudents(student),HttpStatus.CREATED);
    }
    
    @GetMapping("/students-inner-join")
    public ResponseEntity<List<AbhishekStudent>>getStudentsInner()
    {
        return new ResponseEntity<>(studentService.getStudentInner(),HttpStatus.OK);
    }
    @GetMapping("/students-left-outer-join")
    public ResponseEntity<List<AbhishekStudent>> getStudentsLeftOuter()
    {
        return new ResponseEntity<>(studentService.getStudentLeftOuter(),HttpStatus.OK);
    }
   
}


