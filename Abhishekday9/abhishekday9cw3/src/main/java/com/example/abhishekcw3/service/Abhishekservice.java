package com.example.abhishekcw3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abhishekcw3.model.Abhishek;
import com.example.abhishekcw3.repository.Abhishekrepo;



@Service
public class Abhishekservice {
    @Autowired
    private Abhishekrepo rep;

    public boolean post(Abhishek person)
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

    public Abhishek start(String lastname)
    {
        return rep.findByName(lastname);
    }
    public Abhishek get3(int id)
    {
        return rep.findById(id);
    }

    public List<Abhishek> end(int population)
    {
        return rep.findByPopulation(population);
    }
    
}
