package com.example.eregisrar.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long studentId;

    @Column(name="student_number", unique = true, nullable = false)
    private Long studentNumber;

    private String name;
    private Float cgpa;

    @Column(name = "admission_date")
    private LocalDate admissionDate;




    public Student() {
    }

    public Student(Long studentNumber, String name, Float cgpa, LocalDate admissionDate) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.cgpa = cgpa;
        this.admissionDate = admissionDate;

    }



    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getCgpa() {
        return cgpa;
    }

    public void setCgpa(Float cgpa) {
        this.cgpa = cgpa;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentNumber=" + studentNumber +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                ", admissionDate=" + admissionDate +
                '}';
    }
}
