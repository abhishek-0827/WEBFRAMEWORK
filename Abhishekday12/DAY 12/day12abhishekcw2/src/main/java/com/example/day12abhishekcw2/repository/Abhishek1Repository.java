package com.example.day12abhishekcw2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.day12abhishekcw2.model.AbhishekStudent;

@Repository
public interface Abhishek1Repository extends JpaRepository<AbhishekStudent,Integer>{
  
    @Query(value="select s.* from student s inner join student_detail st on s.id=st.student_id",nativeQuery = true)
    List<AbhishekStudent>getStudentInner();

    @Query(value="select s.* from student s left outer join student_detail st on s.id=st.student_id",nativeQuery = true)
    List<AbhishekStudent> getStudentsLeftOuter();

    

    
}
