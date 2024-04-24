package com.example.abhishekcw1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abhishekcw1.model.Abhishekperson;
import com.example.abhishekcw1.repository.Abhishekrepo;



@Service
public class Abhishekservice {
    @Autowired
    private Abhishekrepo rep;

    public boolean post(Abhishekperson person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<Abhishekperson> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<Abhishekperson> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}
