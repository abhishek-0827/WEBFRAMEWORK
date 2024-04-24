package com.example.abhishekcw2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.abhishekcw2.model.Abhishek;
import com.example.abhishekcw2.service.AbhishekService;


@RestController
public class AbhishekController {

     @Autowired
     public AbhishekService CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<Abhishek> postMethodName(@RequestBody Abhishek entity) {

          Abhishek inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<Abhishek>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<Abhishek>> getMethodName() {

          List<Abhishek> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<Abhishek>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<Abhishek>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<Abhishek> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}