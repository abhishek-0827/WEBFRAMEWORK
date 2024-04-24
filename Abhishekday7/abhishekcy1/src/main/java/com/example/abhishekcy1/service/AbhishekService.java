package com.example.abhishekcy1.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.abhishekcy1.model.AbhishekProduct;
import com.example.abhishekcy1.repository.AbhiRepo;

@Service
public class AbhishekService {
    @Autowired
    public AbhiRepo repo;

    @SuppressWarnings("null")
    public boolean post(AbhishekProduct c) {
        try {

            repo.save(c);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<AbhishekProduct> getAll() {
        return repo.findAll();

    }

    public List<AbhishekProduct> getProduct(String age) {
        return repo.findByProductCategory(age);

    }
    public List<AbhishekProduct> getProductbyprice(String age) {
        return repo.findByPriceCategory(age);

    }

}
