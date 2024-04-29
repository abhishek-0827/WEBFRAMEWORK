package com.example.day14abhishekcw.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14abhishekcw.model.Payroll;
import com.example.day14abhishekcw.service.Abhishekservice;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class AbhishekPayrollController {
    @Autowired
     public Abhishekservice PayrollService;

    @PutMapping("/employee/{employeeId}/payroll")
    public Payroll addPayroll(@PathVariable Long employeeId,@RequestBody Payroll payroll) {
        return PayrollService.addPayroll(employeeId,payroll);
    }

    @GetMapping("/employee/{employeeId}/payroll")
    public Optional<Payroll> getMethodName(@PathVariable Long employeeId) {
        return PayrollService.getPayroll(employeeId);
    }
    
    
}
