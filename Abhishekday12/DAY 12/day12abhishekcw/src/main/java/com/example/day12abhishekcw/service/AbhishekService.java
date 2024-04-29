package com.example.day12abhishekcw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day12abhishekcw.model.Abhishek;
import com.example.day12abhishekcw.repository.Abhishek1Repo;
import com.example.day12abhishekcw.repository.AbhishekRepo;

@Service
public class AbhishekService {
    @Autowired
    AbhishekRepo addressRepo;
    @Autowired
    Abhishek1Repo employeeRepo;
    public Abhishek setAddressById(int id,Abhishek address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
