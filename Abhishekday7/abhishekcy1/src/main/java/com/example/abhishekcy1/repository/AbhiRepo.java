package com.example.abhishekcy1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.abhishekcy1.model.AbhishekProduct;


@Repository
public interface AbhiRepo extends JpaRepository<AbhishekProduct, Integer> {

    public List<AbhishekProduct> findByProductCategory(String productCategory);
    public List<AbhishekProduct> findByPriceCategory(String priceCategory);

}
