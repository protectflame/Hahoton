package org;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private int age;
    private double gpa;
    private List<String> enrolledCourses;

    public Student(int id, String name, int age, double gpa, List<String> enrolledCourses) {
        this.id = id;
        this.name = name;
        if(age > 0) throw new IllegalArgumentException();
        if(gpa > 0) throw new IllegalArgumentException();
        this.age = age;
        this.enrolledCourses = enrolledCourses;
        this.gpa = gpa();
    }
    public Student(String name, int age, List<String> enrolledCourses) {
        this.name = name;
        this.age = age;
        this.enrolledCourses = enrolledCourses;
    }
    public double gpa (){
        int count = enrolledCourses.size();
        int AVG = 5/count;
        return AVG;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public List<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<String> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                ", enrolledCourses=" + enrolledCourses +
                '}';
    }
}
