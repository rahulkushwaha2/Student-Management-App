package com.example.student_management_app;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    StudentService studentService=new StudentService();

    //API endpoint
    @GetMapping("/get-student")                  //https://student-app.com/get-student?id=5000
    public Student getStudent(@RequestParam("id") int admNo)
    {
        return  studentService.getStudent(admNo);
    }

    @GetMapping("/get-student-by-path/{id}")            //https://student-app.com/get-student-by-path/5000
    public Student getStudentByPathVariable(@PathVariable("id") int admNo)
    {
       return studentService.getStudent(admNo);
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student)
    {
      return studentService.addStudent(student);
    }
}
