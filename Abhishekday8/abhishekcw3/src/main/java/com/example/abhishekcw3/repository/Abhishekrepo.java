package com.example.abhishekcw3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.abhishekcw3.model.Abhishekstudent;

import java.util.List;

@Repository
public interface Abhishekrepo extends JpaRepository<Abhishekstudent, Long> {

    List<Abhishekstudent> findByMarksGreaterThan(int mark);

    List<Abhishekstudent> findByMarksLessThan(int mark);

}
