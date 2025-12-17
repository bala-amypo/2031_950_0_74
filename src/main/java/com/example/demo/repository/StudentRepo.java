package com.example.demo.repository;

import org.springframework.web.bind.annotation.*;
import org.sringframework.data.jpa.repository.Jparepository;
import org.sringframework.stereotype.repository;

@repository
public interface StudentRepo extends Jparepository<Student,Integer>{

}

