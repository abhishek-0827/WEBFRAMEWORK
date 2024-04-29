package com.example.abhishekday13.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abhishekday13.model.Abhishek1;
import com.example.abhishekday13.repository.AbhishekRepository;


@Service
public class AbhishekService {
    @Autowired
    private AbhishekRepository authorRepository;

    public Abhishek1 saveAuthor(Abhishek1 author) {
        return authorRepository.save(author);
    }

    public Abhishek1 getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<Abhishek1> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Abhishek1 updateAuthor(Long id, Abhishek1 author) {
        Abhishek1 existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
