package com.example.studentregistration.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.studentregistration.model.Student;

@Service
public class StudentService {

    private List<Student> students = new ArrayList<>();

    // Register student
    public Student registerStudent(Student student) {
        students.add(student);
        return student;
    }

    // Get all students
    public List<Student> getAllStudents() {
        return students;
    }

    // Find student by ID
    public Student getStudentById(int id) {
        for (Student s : students) {
            if (s.getStudentId() == id) {
                return s;
            }
        }
        return null;
    }

    // Delete student
    public String deleteStudent(int id) {
        boolean removed =
                students.removeIf(
                    s -> s.getStudentId() == id
                );

        if (removed) {
            return "Student registration deleted successfully";
        } else {
            return "Student not found";
        }
    }
}