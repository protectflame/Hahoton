package org.example.service;

import org.example.Student;

import java.util.List;
import java.util.Random;

public class use {
    Random rand = new Random();
    /*
    public Student(int id, String name, int age, double gpa, List<String> enrolledCourses) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.enrolledCourses = enrolledCourses;
     */
    public void add(String name,int age, List<String> enrolledCourses) {
    Student s1 = new Student(name,age,enrolledCourses);

    }

}
