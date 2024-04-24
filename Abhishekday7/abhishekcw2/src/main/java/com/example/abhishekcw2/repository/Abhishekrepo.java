package com.example.abhishekcw2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.abhishekcw2.model.Abhishek;


@Repository
public interface Abhishekrepo extends JpaRepository<Abhishek, Integer> {

     List<Abhishek> findByCourseName(String courseName);

}