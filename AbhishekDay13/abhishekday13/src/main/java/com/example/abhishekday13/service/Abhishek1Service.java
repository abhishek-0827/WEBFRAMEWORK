package com.example.abhishekday13.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abhishekday13.model.Abhi;
import com.example.abhishekday13.model.Abhishek1;
import com.example.abhishekday13.repository.Abhishek1Repository;
import com.example.abhishekday13.repository.AbhishekRepository;




@Service
public class Abhishek1Service {
    @Autowired
    private Abhishek1Repository bookRepository;
@Autowired
private AbhishekRepository authorRepository;
    public Abhi saveBook(Long authorId, Abhi book) {
        Abhishek1 author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public Abhi getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

