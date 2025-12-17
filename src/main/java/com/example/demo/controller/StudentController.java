package com.example.bef.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bef.entity.Student;
import com.example.bef.service.Studentservice;


@RestController

public class Studentcontroller {
  @Autowired
      Studentservice ser;
      @PostMapping("/post student")
      public Student addstudent(@RequestBody Student var)
      {
        return ser.saveData(var);
      }
      @GetMapping("/get student")
      public List<Student>getStudents(){
        return ser.getStudents();
    }

    @GetMapping("/get/{id}")
       public Student getById(@PathVariable int id)
       {
        return ser.getById(id);
       }
      
    @DeleteMapping("/delete/{id}")
    public Student delete(@PathVariable int id)
    {
        return ser.delete(id);
    }   

}
