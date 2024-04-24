package com.example.abhishekcw2.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.abhishekcw2.model.Abhishekproduct;
import com.example.abhishekcw2.repository.AbhishekProductRepo;



@Service
public class Abhishekservice {
    @Autowired
    private AbhishekProductRepo rep;

    @SuppressWarnings("null")
    public boolean post(Abhishekproduct person)
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

    public List<Abhishekproduct> start(String value)
    {
        return rep.findByProductNameStartingWith(value);
    }

    public List<Abhishekproduct> end(String value)
    {
        return rep.findByProductNameEndingWith(value);
    }
    public List<Abhishekproduct> sort()
    {
        return rep.findAll(Sort.by("price"));
    }
    
}
