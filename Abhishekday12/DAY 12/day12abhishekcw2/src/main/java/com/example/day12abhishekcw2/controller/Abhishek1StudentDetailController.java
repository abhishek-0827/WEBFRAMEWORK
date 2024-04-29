package com.example.day12abhishekcw2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day12abhishekcw2.model.Abhishek1StudentDetail;
import com.example.day12abhishekcw2.service.AbhishekDetailService;







@RestController
public class Abhishek1StudentDetailController {
    @Autowired
    AbhishekDetailService studentDetailService;
    
    @PostMapping("/studentDetail/student/{id}")
    public ResponseEntity<Abhishek1StudentDetail> addStudentDetails(@PathVariable int id,@RequestBody Abhishek1StudentDetail studentDetail)
    {
       return new ResponseEntity<>(studentDetailService.addStudentDetail(id,studentDetail),HttpStatus.CREATED);
    }
    
}
