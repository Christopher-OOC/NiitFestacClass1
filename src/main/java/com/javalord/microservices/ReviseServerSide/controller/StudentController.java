package com.javalord.microservices.ReviseServerSide.controller;

import com.javalord.microservices.ReviseServerSide.model.Student;
import com.javalord.microservices.ReviseServerSide.repository.StudentRepository;
import com.javalord.microservices.ReviseServerSide.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/festac")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService =  studentService;
    }

    @GetMapping
    public String showAllStudents() {

        return "index";
    }

    @GetMapping(value = "/students")
    public String showStudentPage(Model model) {
        model.addAttribute("newStudent", new Student());
        model.addAttribute("students", studentService.getAllStudents());

        return "student";
    }

    @PostMapping(value = "/students")
    public String createStudent(@ModelAttribute("newStudent") Student student) {
        studentService.saveStudent(student);

        return "redirect:/festac/students";
    }
}
