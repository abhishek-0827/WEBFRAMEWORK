package com.example.abhishek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.abhishek.model.Abhishek;
import com.example.abhishek.service.Abhishekser;


@RestController
public class Abhishekcontroller {

     @Autowired
     public Abhishekser personService;
     @PostMapping("/api/person")
     public ResponseEntity<Abhishek> postMethodName(@RequestBody Abhishek entity) {

          Abhishek inst = personService.SaveEntity(entity);

          return new ResponseEntity<Abhishek>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<Abhishek>> getMethodName() {

          List<Abhishek> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<Abhishek>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<Abhishek>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<Abhishek> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}