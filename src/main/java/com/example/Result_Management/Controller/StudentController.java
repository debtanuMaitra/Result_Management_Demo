package com.example.Result_Management.Controller;

import com.example.Result_Management.Models.Student;
import com.example.Result_Management.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add-student")
    public String addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return "Student Added Successfully!";
    }
}
