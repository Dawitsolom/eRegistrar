package com.example.eregisrar.service.impl;

import com.example.eregisrar.model.Student;
import com.example.eregisrar.repository.StudentRepository;
import com.example.eregisrar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

//    @Override
//    public List<Student>  getAllBooks() {
//        return (List<Student>)repository.findAll();
//    }


    @Override
    public List<Student> getAllStudents() {
        //TODO implement this
        return null;
    }

    @Override
    public Student save(Student s) {
        return null;
    }

    @Override
    public List<Student> getPassingStudentsOnly() {
        return null;
    }

    @Override
    public List<Student> getLatestStudents() {
        return null;
    }

    @Override
    public Student getStudentById(long id) {
        return null;
    }

    @Override
    public void updateStudent(long studentId) {

    }
}
