package com.example.abhishekpah.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.abhishekpah.model.Abhishek;
import com.example.abhishekpah.service.AbhishekService;


@RestController
@RequestMapping("/api")
public class AbhishekController {
    
    @Autowired
    private AbhishekService userService;

    @PostMapping("/user")
    public ResponseEntity<Abhishek> post(@RequestBody Abhishek user)
    {
        if(userService.postUser(user))
        {
            return new ResponseEntity<Abhishek>(user, HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<Abhishek> getById(@PathVariable int userId)
    {
        Abhishek user = userService.getById(userId);
        if(user == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<Abhishek>(user, HttpStatus.OK);
        }
    }

    @GetMapping("/user/byName/{userName}")
    public ResponseEntity<Abhishek> getByUserName(@PathVariable String userName)
    {
        Abhishek user = userService.getByUserName(userName);
        if(user == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<Abhishek>(user, HttpStatus.OK);
        }
    }
}
