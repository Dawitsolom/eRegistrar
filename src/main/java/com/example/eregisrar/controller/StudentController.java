package com.example.eregisrar.controller;

import com.example.eregisrar.model.Student;
import com.example.eregisrar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;


    @GetMapping(value = {"/elibrary/book/list","/book/list"})
    public ModelAndView listBooks() {
        ModelAndView modelAndView = new ModelAndView();
        List<Student> books = studentService.getAllStudents();
        modelAndView.addObject("books", books);
        modelAndView.addObject("searchString", "");
        modelAndView.addObject("booksCount", books.size());
        modelAndView.setViewName("book/list");
        return modelAndView;
    }

    @GetMapping(value = {"/student/new", "/eregistrar/student/new"})
    public String showNewStudentForm(Model model) {
        //Notice how we don't even return model
        //not to mention the fact that it is a parameter we EXPECT FROM SPRING
        model.addAttribute("student", new Student());
        return "student/new";
    }

}
