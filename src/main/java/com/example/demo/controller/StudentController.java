package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;


@RestController

public class StudentController {
  @Autowired
      StudenService ser;
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
