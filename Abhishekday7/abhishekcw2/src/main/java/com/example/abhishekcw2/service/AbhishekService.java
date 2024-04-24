package com.example.abhishekcw2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.abhishekcw2.model.Abhishek;
import com.example.abhishekcw2.repository.Abhishekrepo;


@Service
public class AbhishekService {

     @Autowired
     public Abhishekrepo courseRepo;

     public Abhishek SaveEntity(Abhishek entity) {
          return courseRepo.save(entity);

     }

     public List<Abhishek> getDetails() {
          return courseRepo.findAll();

     }

     public List<Abhishek> findByCourseName(String courseName) {
          return courseRepo.findByCourseName(courseName);
     }

}
