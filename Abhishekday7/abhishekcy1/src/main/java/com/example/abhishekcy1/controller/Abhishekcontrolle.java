package com.example.abhishekcy1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.abhishekcy1.model.AbhishekProduct;
import com.example.abhishekcy1.service.AbhishekService;


@RestController
public class Abhishekcontrolle {
    @Autowired
    AbhishekService service;

    @PostMapping("/api/Product")
    public ResponseEntity<AbhishekProduct> postMethod(@RequestBody AbhishekProduct s) {
        if (service.post(s)) {
            return new ResponseEntity<AbhishekProduct>(s, HttpStatus.CREATED);
        } else {

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/product")
    public ResponseEntity<List<AbhishekProduct>> dndcjk() {
        List<AbhishekProduct> page = service.getAll();
        if (!page.isEmpty()) {
            return new ResponseEntity<List<AbhishekProduct>>(page, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @GetMapping("/api/product/category/{productCategory}")
    public ResponseEntity<List<AbhishekProduct>> getbyid(@PathVariable String productCategory) {
        List<AbhishekProduct> p = service.getProduct(productCategory);
        if (!p.isEmpty()) {
            return new ResponseEntity<List<AbhishekProduct>>(p, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

    @GetMapping("/api/product/category/priceCategory/{priceCategory}")
    public ResponseEntity<List<AbhishekProduct>> getbdyid(@PathVariable String priceCategory) {
        List<AbhishekProduct> p = service.getProductbyprice(priceCategory);
        if (!p.isEmpty()) {
            return new ResponseEntity<List<AbhishekProduct>>(p, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

}
