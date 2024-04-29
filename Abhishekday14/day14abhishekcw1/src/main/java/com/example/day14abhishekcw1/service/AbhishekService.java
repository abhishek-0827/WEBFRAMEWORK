package com.example.day14abhishekcw1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14abhishekcw1.model.Abhishek;
import com.example.day14abhishekcw1.repository.Abhishek.AbhishekRepo;


@Service
public class AbhishekService {
   @Autowired
   AbhishekRepo bookRepo;

   public Abhishek addBook(Abhishek book)
   {
        return bookRepo.save(book);
   }

   public List<Abhishek> getBooks()
   {
        return bookRepo.findAll();
   }

   public Optional<Abhishek> getBook(int id)
   {
    return bookRepo.findById(id);
   }

   public Abhishek updateBook(int id,Abhishek book)
   {
        Abhishek avail = bookRepo.findById(id).orElse(null);
        if(avail!=null)
        {
            avail.setAuthor(book.getAuthor());
            avail.setAvailableCopies(book.getAvailableCopies());
            avail.setTitle(book.getTitle());
            avail.setTotalCopies(book.getTotalCopies());
            return bookRepo.save(avail);
        }
        else 
        return null;
   }
}
