package com.example.abhishekday6cw2.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.abhishekday6cw2.model.Abhishek;
import com.example.abhishekday6cw2.repository.ABhishek;


@Service
public class AbhishekService {
    public ABhishek studentRepo;
    public AbhishekService(ABhishek studentRepo)
    {
        this.studentRepo = studentRepo;
    }
    public boolean postStudent(Abhishek student)
    {
        try{

            studentRepo.save(student);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<Abhishek> paginationStudents(int pageno,int size)
    {
        return studentRepo.findAll(PageRequest.of(pageno, size)).getContent();
    }
    public List<Abhishek>  sortPaginationStudents(int pageno,int size,String field)
    {
        return studentRepo.findAll(PageRequest.of(pageno, size,Sort.by(field))).getContent();
    }
}

