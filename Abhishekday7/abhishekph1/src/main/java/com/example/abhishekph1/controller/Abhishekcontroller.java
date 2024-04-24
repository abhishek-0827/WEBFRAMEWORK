package com.example.abhishekph1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.abhishekph1.model.Abhishek;
import com.example.abhishekph1.service.AbhishekService;



@RestController
public class Abhishekcontroller {
    @Autowired
    private AbhishekService carService;

    @PostMapping("/api/car")
    public ResponseEntity<Abhishek> post(@RequestBody Abhishek car) {
        if (carService.post(car)) {
            return new ResponseEntity<>(car, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/car")
    public ResponseEntity<List<Abhishek>> getAll() {
        List<Abhishek> li = carService.getAll();
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/car/distinct")
    public ResponseEntity<Abhishek> getbyDistinct(@RequestParam String currentOwnerName, @RequestParam String address) {
        Abhishek car = carService.getByDetails(currentOwnerName, address);
        if (car != null) {
            return new ResponseEntity<>(car, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
