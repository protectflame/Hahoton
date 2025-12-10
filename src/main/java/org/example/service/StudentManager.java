package org.example.service;

import org.example.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

    //
public class StudentManager {
    private int nextId = 1;
    private ArrayList<Student> students = new ArrayList<>();

    //Добавлени е студента как перечент аргументов
    public void add(String name, int age, List<String> enrolledCourses) {
        Student student = new Student(nextId, name, age, 0.0, enrolledCourses);
        students.add(student);
        nextId++;
    }
    //Добавление студента как объекта
    public void add(Student student) {
            students.add(student);
            nextId = student.getId() + 1;
            student.setId(nextId);
            nextId++;

    }

    //Удаление по ID
    public boolean remove(int id) {
        return students.removeIf(s -> s.getId() == id);
    }

    public Student getById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public List<Student> filterByAge(int minAge, int maxAge){
             return students.stream()
                     .filter(s -> s.getAge() >= minAge && s.getAge() <= maxAge)
                     .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public String toString() {
        return "StudentManager{" +
                "nextId=" + nextId +
                ", students=" + students +
                '}';
    }
}
