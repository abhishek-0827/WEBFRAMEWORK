package com.example.abhishekcw2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.abhishekcw2.model.AbhishekRecipe;
import com.example.abhishekcw2.service.AbhishekService;

import java.util.*;


@RestController
public class RecipeController {
    @Autowired
    private AbhishekService ser;

    @PostMapping("/api/recipe")
    public ResponseEntity<AbhishekRecipe> post(@RequestBody AbhishekRecipe person) {
        if (ser.post(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/recipe/byname")
    public ResponseEntity<List<AbhishekRecipe>> getAllbyFiltering(@RequestParam("recipeName") String recipeName) {
        List<AbhishekRecipe> li = ser.filter(recipeName);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/recipe/{recipeId}")
    public ResponseEntity<AbhishekRecipe> getbyrecipeId(@PathVariable("recipeId") int recipeId) {
        AbhishekRecipe li = ser.getByid(recipeId);
        if (li!=null) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
