package com.example.abhishek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.abhishek.model.Abhishek;
import com.example.abhishek.repository.Abhishekrepo;



@Service
public class Abhishekser {

     @Autowired
     public Abhishekrepo personRepo;

     public Abhishek SaveEntity(Abhishek entity) {
          return personRepo.save(entity);

     }

     public List<Abhishek> getDetails() {
          return personRepo.findAll();

     }

     public List<Abhishek> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}
