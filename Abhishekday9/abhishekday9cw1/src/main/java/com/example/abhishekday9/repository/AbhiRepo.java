package com.example.abhishekday9.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.abhishekday9.model.abhi;



public interface AbhiRepo extends JpaRepository<abhi, Integer> {
    @Query("SELECT p FROM Person p WHERE age=?1")
    List<abhi> findByAge(int age);
}
