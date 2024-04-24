package com.example.abhishekday10pah.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abhishekday10pah.model.Abhishekproduct;
import com.example.abhishekday10pah.repository.Abhishekrepo;


@Service
public class AbhishekService {
    @Autowired
    private Abhishekrepo productRepo;

    public boolean saveProduct(Abhishekproduct product)
    {
        try
        {
            productRepo.save(product);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    public List<Abhishekproduct> findByCategoryList(String category)
    {
        return productRepo.findByCategoryList(category);
    }

    public Abhishekproduct updateProduct(int productId, int quantityInStock)
    {
        productRepo.updateQuantity(productId, quantityInStock);
        return productRepo.findById(productId).orElse(null);
    }

    public Abhishekproduct deleteProduct(int productId)
    {
        productRepo.deleteProduct(productId);
        return productRepo.findById(productId).orElse(null);
    }
}