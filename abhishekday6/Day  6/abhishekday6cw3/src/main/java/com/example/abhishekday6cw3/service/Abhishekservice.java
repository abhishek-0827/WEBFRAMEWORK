package com.example.abhishekday6cw3.service;


import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.abhishekday6cw3.model.AbhishekProduct;
import com.example.abhishekday6cw3.repository.Abhishekrepo;




@Service
public class Abhishekservice {
    public Abhishekrepo productRepo;
    public Abhishekservice(Abhishekrepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(AbhishekProduct product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<AbhishekProduct> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<AbhishekProduct> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public AbhishekProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}

