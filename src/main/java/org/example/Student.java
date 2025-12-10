package org.example;

import java.util.List;
import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private int age;
    private double gpa;
    private List<String> enrolledCourses;

    public Student(int id, String name, int age, double gpa, List<String> enrolledCourses) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.enrolledCourses = enrolledCourses;
    }
    public Student(String name, int age, List<String> enrolledCourses) {
        this.name = name;
        this.age = age;
        this.enrolledCourses = enrolledCourses;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && Double.compare(gpa, student.gpa) == 0 && Objects.equals(name, student.name) && Objects.equals(enrolledCourses, student.enrolledCourses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, gpa, enrolledCourses);
    }

    public void info(){

    }
}
