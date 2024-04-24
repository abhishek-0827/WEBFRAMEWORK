package com.example.abhishekpah.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abhishekpah.model.Abhishek;
import com.example.abhishekpah.repository.AbhishekRepo;


@Service
public class AbhishekService {
   @Autowired
   private AbhishekRepo userRepo;
   
   public boolean postUser(Abhishek user)
   {
        try{
            userRepo.save(user);
            return true;
        }
        catch(Exception e){
            return false;
        }   
   }

   public Abhishek getById(int userId)
   {
        return userRepo.findByUserId(userId);
   }

   public Abhishek getByUserName(String userName)
   {
        return userRepo.findByUserName(userName);
   }
}
