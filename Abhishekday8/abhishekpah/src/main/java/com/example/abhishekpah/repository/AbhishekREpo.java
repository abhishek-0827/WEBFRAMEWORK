package com.example.abhishekpah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.abhishekpah.model.AbhishekPerson;

import java.util.List;


@Repository
public interface AbhishekREpo extends JpaRepository<AbhishekPerson,Integer>{

    List<AbhishekPerson> findByLastnameNot(String lastname);
    List<AbhishekPerson> findByAgeNotIn(List<Integer> ages);
    
}
