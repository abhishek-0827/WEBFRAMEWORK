package com.example.abhishekday13.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.abhishekday13.model.Abhi;
import com.example.abhishekday13.model.Abhishek1;
import com.example.abhishekday13.service.Abhishek1Service;
import com.example.abhishekday13.service.AbhishekService;




@RestController
public class AbhishekController {
    @Autowired
    private AbhishekService authorService;
@Autowired
private Abhishek1Service bookService;
    @PostMapping("/author")
    public ResponseEntity<Abhishek1> createAuthor(@RequestBody Abhishek1 author) {
        Abhishek1 savedAuthor = authorService.saveAuthor(author);
        return new ResponseEntity<>(savedAuthor, HttpStatus.CREATED);
    }

    @PostMapping("/book/author/{authorId}")
    public ResponseEntity<Abhi> createBookForAuthor(@PathVariable Long authorId, @RequestBody Abhi book) {
        Abhi savedBook = bookService.saveBook(authorId, book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @GetMapping("/author/{authorId}")
    public ResponseEntity<Abhishek1> getAuthorById(@PathVariable Long authorId) {
        Abhishek1 author = authorService.getAuthorById(authorId);
        if (author != null) {
            return new ResponseEntity<>(author, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/author")
    public ResponseEntity<List<Abhishek1>> getAllAuthors() {
        List<Abhishek1> authors = authorService.getAllAuthors();
        return new ResponseEntity<>(authors, HttpStatus.OK);
    }

    @PutMapping("/author/{authorId}")
    public ResponseEntity<Abhishek1> updateAuthor(@PathVariable Long authorId, @RequestBody Abhishek1 author) {
        Abhishek1 updatedAuthor = authorService.updateAuthor(authorId, author);
        if (updatedAuthor != null) {
            return new ResponseEntity<>(updatedAuthor, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable Long bookId) {
        bookService.deleteBook(bookId);
        return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
    }
}
