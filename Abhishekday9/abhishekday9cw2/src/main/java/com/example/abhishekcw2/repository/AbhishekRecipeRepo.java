package com.example.abhishekcw2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.abhishekcw2.model.AbhishekRecipe;

import java.util.List;


@Repository
public interface AbhishekRecipeRepo extends JpaRepository<AbhishekRecipe,Integer>{

    @Query("select r from Recipe r where recipeName=?1")
    List<AbhishekRecipe> findByProduct(String name);
    
}
