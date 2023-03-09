package com.example.Result_Management.Service;

import com.example.Result_Management.Models.Student;
import com.example.Result_Management.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student) {
        studentRepository.save(student);
    }
}
