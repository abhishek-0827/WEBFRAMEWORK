package com.example.abhishekcw1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.abhishekcw1.model.Abhishekperson;

import java.util.List;


@Repository
public interface Abhishekrepo extends JpaRepository<Abhishekperson,Integer>{

    List<Abhishekperson> findByNameStartingWith(String name);
    List<Abhishekperson> findByNameEndingWith(String name);
    
}
