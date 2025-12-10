package org.example.service;

import org.example.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentManager {
    private int id;


    Random rand = new Random();
    private ArrayList<Student> students = new ArrayList<>();

    public void add(String name,int age, List<String> enrolledCourses) {
    int ID = 1;
    Student s1 = new Student(name,age,enrolledCourses);
    students.add(s1);
    s1 = new Student();
    ID++;


    }

    public void remove(int id){

    }
}
