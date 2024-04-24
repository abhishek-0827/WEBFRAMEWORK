package com.example.abhishekpah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.abhishekpah.model.Abhishek;



@Repository
public interface AbhishekRepo extends JpaRepository<Abhishek, Integer> {
    @Query(value = "SELECT u FROM User u WHERE u.userId = ?1")
    Abhishek findByUserId(int userId);

    @Query(value = "SELECT u FROM User u WHERE u.userName=?1")
    Abhishek findByUserName(String userName);
}
