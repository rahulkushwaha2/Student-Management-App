package com.example.student_management_app;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {

    Map<Integer,Student> studentDB=new HashMap<>();

    public Student getStudent(int admNo)
    {
        return studentDB.get(admNo);
    }
    public String addStudent(Student student)
    {
        studentDB.put(student.getAdmNo(),student);
        return "Student added successfully";
    }

}
