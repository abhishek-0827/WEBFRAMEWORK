package com.example.abhishekcw3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abhishekcw3.model.Abhishek;
import com.example.abhishekcw3.repository.Abhishekrepo;



@Service
public class AbhishekService {
    @Autowired
    private Abhishekrepo rep;

    public boolean post(Abhishek door)
    {
        try
        {
            rep.save(door);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<Abhishek> getAll()
    {
        return rep.findAll();
    }

    public List<Abhishek> getbyDoorId(int doorId)
    {
        return rep.findByDoorId(doorId);
    }
    public List<Abhishek> getbyType(String type)
    {
        return rep.findByAccessType(type);
    }
    
}
