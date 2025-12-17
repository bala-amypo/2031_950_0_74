package com.example.demo.repository;

import org.springframework.web.bind.annotation.*;
import org.sringframework.data.jpa.repository.JpaRepository;
import org.sringframework.stereotype.repository;

import com.example.demo.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{
  
}

