package com.example.day12abhishekcw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day12abhishekcw.model.AbhishekEmployee;
import com.example.day12abhishekcw.service.Abhishek1Service;



@RestController
public class Abhishek11Controller {
    @Autowired
    Abhishek1Service employeeService;

    @PostMapping("/employee")
    public AbhishekEmployee setMethod(@RequestBody AbhishekEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<AbhishekEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<AbhishekEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
