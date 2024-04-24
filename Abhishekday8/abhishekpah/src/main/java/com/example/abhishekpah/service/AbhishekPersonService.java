package com.example.abhishekpah.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abhishekpah.model.AbhishekPerson;
import com.example.abhishekpah.repository.AbhishekREpo;


@Service
public class AbhishekPersonService {
    @Autowired
    private AbhishekREpo rep;

    public boolean post(AbhishekPerson person)
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

    public List<AbhishekPerson> start(String lastname)
    {
        return rep.findByLastnameNot(lastname);
    }

    public List<AbhishekPerson> end(List<Integer> ages)
    {
        return rep.findByAgeNotIn(ages);
    }
    
}
