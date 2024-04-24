package com.example.abhishekph1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.abhishekph1.model.Abhishek;


@Repository
public interface AbhishekRepo extends JpaRepository<Abhishek,Integer>{

    Abhishek findDistinctBycurrentOwnerNameAndAddress(String currentOwnerName, String address); 
}
