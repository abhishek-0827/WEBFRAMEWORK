package com.example.abhishekcw3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.abhishekcw3.model.Abhishek;

import java.util.List;

@Repository
public interface Abhishekrepo extends JpaRepository<Abhishek, Integer> {

    @Query("select v from Village as v where v.villageName=?1")
    Abhishek findByName(String villageName);

    @Query("select v from Village as v where v.villageId=?1")
    Abhishek findById(int id);

    @Query("select v from Village as v where v.villagePopulation=?1")
    List<Abhishek> findByPopulation(int population);

}
