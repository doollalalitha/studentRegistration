package com.example.studentregistration.model;



public class Student {

    private int studentId;
    private String studentName;
    private String courseName;
    private String email;
    private int age;

    public Student() {
    }

    public Student(int studentId, String studentName,
            String courseName, String email, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.courseName = courseName;
        this.email = email;
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
