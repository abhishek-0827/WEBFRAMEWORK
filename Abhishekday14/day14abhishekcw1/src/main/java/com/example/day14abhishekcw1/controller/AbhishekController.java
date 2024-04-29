package com.example.day14abhishekcw1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14abhishekcw1.model.Abhishek;
import com.example.day14abhishekcw1.service.AbhishekService;


@RestController
public class AbhishekController {
    @Autowired
    AbhishekService bookService;

    @PostMapping("/api/book")
    public Abhishek addBook(@RequestBody Abhishek book)
    {
        return bookService.addBook(book);
    }

    @PutMapping("/api/book/{id}")
    public Abhishek updateBook(@PathVariable int id,@RequestBody Abhishek book)
    {
        return bookService.updateBook(id,book);
    }

    @GetMapping("/api/book")
    public List<Abhishek> getBooks()
    {
        return bookService.getBooks();
    }

    @GetMapping("/api/book/{id}")
    public Optional<Abhishek> getBook(@PathVariable int id)
    {
        return bookService.getBook(id);
    }
}
