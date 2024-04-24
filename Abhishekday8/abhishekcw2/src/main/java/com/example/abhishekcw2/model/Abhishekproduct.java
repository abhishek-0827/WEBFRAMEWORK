package com.example.abhishekcw2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Abhishekproduct {
    @Id
    private int id;
    private String productName;
    private int price;
    private String category;
    
    public Abhishekproduct(int id, String productName, int price, String category) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.category = category;
    }


    public Abhishekproduct(){}


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getProductName() {
        return productName;
    }


    public void setProductName(String productName) {
        this.productName = productName;
    }


    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }


    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }
    
    
    
}
