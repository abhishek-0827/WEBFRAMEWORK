package com.example.abhishekday10cw1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abhishekday10cw1.model.Abhishel;
import com.example.abhishekday10cw1.repository.Abhishekrepo;

@Service
public class Abhishekservice {
    @Autowired
    private Abhishekrepo doorRepo;

    public Abhishel postData(Abhishel door) {
        return doorRepo.save(door);
    }

    public List<Abhishel> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public Abhishel updateDetail(int doorid, Abhishel door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<Abhishel> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<Abhishel> getAllDetails() {

        return doorRepo.findAll();
    }

    public Abhishel getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}