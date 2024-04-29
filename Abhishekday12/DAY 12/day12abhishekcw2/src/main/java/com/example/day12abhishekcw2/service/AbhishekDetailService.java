package com.example.day12abhishekcw2.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day12abhishekcw2.model.Abhishek1StudentDetail;
import com.example.day12abhishekcw2.repository.Abhishek1Repository;
import com.example.day12abhishekcw2.repository.AbhishekDetailRepository;


@Service
public class AbhishekDetailService {
    @Autowired
    AbhishekDetailRepository studentDetailRepository;
    @Autowired
    Abhishek1Repository studentRepository;
    public Abhishek1StudentDetail addStudentDetail(int id,Abhishek1StudentDetail studentDetail)
    {
        if(studentRepository.existsById(id))
        {
            studentDetailRepository.addStudentDetail(studentDetail.getAddress(),studentDetail.getPhoneNumber(),id);
            return studentDetail;
        }
        else
        return null;
    }
    
    
}
