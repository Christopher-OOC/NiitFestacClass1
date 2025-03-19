package com.javalord.microservices.ReviseServerSide.service;

import com.javalord.microservices.ReviseServerSide.model.Student;
import com.javalord.microservices.ReviseServerSide.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

}
