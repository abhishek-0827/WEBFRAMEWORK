package com.example.abhishekday10cw1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.abhishekday10cw1.model.Abhishel;



// import jakarta.transaction.Transactiona

@Repository
public interface Abhishekrepo extends JpaRepository<Abhishel, Integer> {

    @Query(value = "DELETE FROM Door WHERE Door_id = ?1", nativeQuery = true)
    void deleteDoor(int DoorId);

    public List<Abhishel> findByColor(String color);

    public List<Abhishel> findByDoorType(String doortype);
}
