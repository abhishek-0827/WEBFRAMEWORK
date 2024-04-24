package com.example.abhishekcw2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.abhishekcw2.model.Abhishekproduct;

import java.util.List;


@Repository
public interface AbhishekProductRepo extends JpaRepository<Abhishekproduct,Integer>{

    List<Abhishekproduct> findByProductNameStartingWith(String name);
    List<Abhishekproduct> findByProductNameEndingWith(String name);
    
}
