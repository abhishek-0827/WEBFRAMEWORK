package com.example.day12abhishekcw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.day12abhishekcw.model.AbhishekEmployee;



public interface Abhishek1Repo extends JpaRepository<AbhishekEmployee,Integer> {
 
    @Query(value = "SELECT e.* FROM employee e INNER JOIN address a ON e.id = a.employee_id",nativeQuery = true)
    List<AbhishekEmployee> getByInnerEmployees();

    @Query(value = "SELECT e.* FROM employee e LEFT JOIN address a ON e.id = a.employee_id",nativeQuery = true)
    List<AbhishekEmployee> getByLeftOuterEmployees();
}