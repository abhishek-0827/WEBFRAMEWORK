package com.example.abhishekday6cw3.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.abhishekday6cw3.model.AbhishekProduct;


@Repository
public interface Abhishekrepo extends JpaRepository<AbhishekProduct,Integer>{
    
}

