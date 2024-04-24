package com.example.abhishekcw2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abhishekcw2.model.AbhishekRecipe;
import com.example.abhishekcw2.repository.AbhishekRecipeRepo;


@Service
public class AbhishekService {
    @Autowired
    private AbhishekRecipeRepo rep;

  
    @SuppressWarnings("null")
    public boolean post(AbhishekRecipe recipe)
    {
        try
        {
            rep.save(recipe);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public AbhishekRecipe getByid(int id)
    {
        return rep.findById(id).orElse(null);
    }

    public List<AbhishekRecipe> filter(String name)
    {
        return rep.findByProduct(name);
    }
    
    
}
