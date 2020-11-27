package com.codegym.mapper.service;

import com.codegym.mapper.model.Student;
import com.codegym.mapper.model.StudentResponse;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    MapperFacade mapper;

    public StudentResponse getStudent(){
        Student student = new Student();
        student.setName("E");
        student.setClazz("C06");
        student.setCity("HaNoi");
        return mapper.map(student, StudentResponse.class);
    }
}
