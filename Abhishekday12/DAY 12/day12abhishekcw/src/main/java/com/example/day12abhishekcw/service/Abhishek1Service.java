package com.example.day12abhishekcw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day12abhishekcw.model.AbhishekEmployee;
import com.example.day12abhishekcw.repository.Abhishek1Repo;



@Service
public class Abhishek1Service {
    @Autowired
    Abhishek1Repo employeeRepo;

    @SuppressWarnings("null")
    public AbhishekEmployee setEmployee(AbhishekEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<AbhishekEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<AbhishekEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
