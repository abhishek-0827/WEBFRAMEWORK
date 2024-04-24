package com.example.abhishek.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.abhishek.model.Abhishek;



/**
 * PersonRepo
 */
@Repository
public interface Abhishekrepo extends JpaRepository<Abhishek, Integer> {

     List<Abhishek> findByAge(int byAge);
}