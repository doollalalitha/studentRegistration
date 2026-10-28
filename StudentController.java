package com.example.studentregistration.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.studentregistration.model.Student;
import com.example.studentregistration.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    // Register student
    @PostMapping
    public Student registerStudent(
            @RequestBody Student student) {
        return service.registerStudent(student);
    }

    // Get all students
    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    // Find student by ID
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(
            @PathVariable int id) {

        Student student = service.getStudentById(id);

        if (student == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(student);
    }

    // Delete student
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        return service.deleteStudent(id);
    }
}