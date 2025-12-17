package com.example.sql.repository;

import org.springframework.web.bind.annotation.*;
import org.sringframework.data.jpa.repository.Jparepository;
import org.sringframework.stereotype.repository;

import com.example.sql.Entitydata.Student;

@repository
public interface StudentRepo extends Jparepository<Student,Integer>{
  
}

