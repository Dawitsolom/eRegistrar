package com.example.eregisrar.service;

import com.example.eregisrar.model.Student;


import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student save(Student s);
    List<Student> getPassingStudentsOnly();
    List<Student> getLatestStudents();
    Student getStudentById(long id);
    void updateStudent(long studentId);
}
