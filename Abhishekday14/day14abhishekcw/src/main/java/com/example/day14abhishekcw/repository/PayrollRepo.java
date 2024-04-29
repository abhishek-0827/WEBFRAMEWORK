package com.example.day14abhishekcw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day14abhishekcw.model.Payroll;


@Repository
public interface PayrollRepo extends JpaRepository<Payroll,Long> {
    
}
