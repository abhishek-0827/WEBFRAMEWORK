package com.example.abhishekph1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.stereotype.Service;

import com.example.abhishekph1.model.Abhishek;
import com.example.abhishekph1.repository.AbhishekRepo;



@Service
public class AbhishekService {
    @Autowired
    private AbhishekRepo carRepo;

    public boolean post(Abhishek car)
    {
        try
        {
            carRepo.save(car);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<Abhishek> getAll()
    {
        return carRepo.findAll();
    }

    public Abhishek getByDetails(String currentOwnerName, String address)
    {
        try{
        return carRepo.findDistinctBycurrentOwnerNameAndAddress(currentOwnerName, address);
        }
        catch(IncorrectResultSizeDataAccessException i)
        {
            System.out.println("\n\n"+i+"\n\nUse List if needed");
            return null;
        }
        catch(Exception e)
        {
            System.out.println("\n\n"+e);
            return null;
        }
    }
    
}
