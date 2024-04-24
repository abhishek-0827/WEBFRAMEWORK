package com.example.abhishekday6pah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.abhishekday6pah.model.Abhishek;


@Repository
public interface Abhishekrepo extends JpaRepository<Abhishek,Integer>{
    
}
