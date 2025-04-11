package com.example.student_management_app;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    StudentRepository studentRepository=new StudentRepository();

    public Student getStudent(int admNo)
    {
        return studentRepository.getStudent(admNo);
    }
    public String addStudent(Student student)
    {
      return studentRepository.addStudent(student);
    }
}
