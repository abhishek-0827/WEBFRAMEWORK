package com.example.abhishekcw3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abhishekcw3.model.Abhishekstudent;
import com.example.abhishekcw3.repository.Abhishekrepo;

@Service
public class Abhishekservice {
    @Autowired
    private Abhishekrepo studentRepo;

    public boolean post(Abhishekstudent student) {
        try {
            studentRepo.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Abhishekstudent> start(int mark) {
        return studentRepo.findByMarksGreaterThan(mark);
    }

    public List<Abhishekstudent> end(int mark) {
        return studentRepo.findByMarksLessThan(mark);
    }

}
