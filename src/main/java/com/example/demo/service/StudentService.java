package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
@Service
public class Studentservice {
    Map<Integer,Student> details=new HashMap<>();
    public Student saveData(Student var) {
        details.put(var.getId(),var);
        return var;
    }

    public List<Student>getStudents(){
        return new ArrayList<>(details.values());
    }

    public Student getById(int id) {
        
        if(details.containsKey(id))
        {
            return details.get(id);
        }
        else{
            return null;
        }
    }

    public Student delete(int id){
        details.remove(id);
        return details.get(id);
    }
}

