package com.example.abhishekday13.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.abhishekday13.model.Abhi;
import com.example.abhishekday13.service.Abhishek1Service;


@RestController
public class Abhishek1Controller {
    @Autowired
    private Abhishek1Service bookService;

    @GetMapping("/book/{bookId}")
    public ResponseEntity<Abhi> getBookById(@PathVariable Long bookId) {
        Abhi book = bookService.getBookById(bookId);
        if (book != null) {
            return new ResponseEntity<>(book, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
