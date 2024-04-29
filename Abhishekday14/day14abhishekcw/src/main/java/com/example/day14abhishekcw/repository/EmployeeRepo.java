package com.example.day14abhishekcw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day14abhishekcw.model.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    
}
