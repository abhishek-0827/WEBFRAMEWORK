package com.example.day14abhishekcw.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14abhishekcw.model.Payroll;
import com.example.day14abhishekcw.repository.PayrollRepo;



@Service
public class Abhishekservice {
    @Autowired
    PayrollRepo payrollRepo;

    public Payroll addPayroll(Long id,Payroll payroll)
    {
        Payroll avail = payrollRepo.findById(id).orElse(null);

        if(avail!=null){
            avail.setAmount(payroll.getAmount());
            avail.setNoOfDaysWorked(payroll.getNoOfDaysWorked());
        return payrollRepo.save(avail);
        }
        else 
        return null;
    }

    public Optional<Payroll> getPayroll(Long employeeId)
    {
        return payrollRepo.findById(employeeId);
    }
}
