package com.example.abhishekcw3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.abhishekcw3.model.Abhishek;

import java.util.List;

@Repository
public interface Abhishekrepo extends JpaRepository<Abhishek,Integer>{

    List<Abhishek> findByDoorId(int doorId);
    List<Abhishek> findByAccessType(String accessType);
    
}
