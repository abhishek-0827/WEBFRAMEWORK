package com.example.abhishekday6cy.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.abhishekday6cy.model.Abhishek;
import com.example.abhishekday6cy.repository.Abhishekrepo;


@Service
public class Abhishekservice {
    public Abhishekrepo employeeRepo;
    public Abhishekservice(Abhishekrepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean postEmployee(Abhishek employee)
    {
        try{

            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<Abhishek> sortEmployee(String field)
    {
        return employeeRepo.findAll(Sort.by(field));
    }
    public List<Abhishek> paginationEmployee(int pageno,int size)
    {
        return employeeRepo.findAll(PageRequest.of(pageno, size)).getContent();
    }
    public List<Abhishek>  sortPaginationEmployee(int pageno,int size,String field)
    {
        return employeeRepo.findAll(PageRequest.of(pageno, size,Sort.by(field))).getContent();
    }
}
