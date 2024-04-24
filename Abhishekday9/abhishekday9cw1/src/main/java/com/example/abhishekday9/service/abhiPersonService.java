package com.example.abhishekday9.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.abhishekday9.model.abhi;
import com.example.abhishekday9.repository.AbhiRepo;



@Service
public class abhiPersonService {
    public AbhiRepo personRepo;

    public abhiPersonService(AbhiRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(abhi person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<abhi> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
