package org.example;
import org.example.service.StudentManager;

import java.util.*;
import java.io.*;

public class Main {
    static void main(String[] args) {
        Student st1 = new Student("Алиев Шамиль", 17, new ArrayList<String>());
        Student st2 = new Student();
        Student st3 = new Student();
        ArrayList <Student> S = new ArrayList<>();
        StudentManager a = new StudentManager();
        
        a.add("Насрулаева Айзар", 17, new ArrayList<String>());
        a.add("Омаев Магомед", 18, new ArrayList<String>());
        a.add(st1);
        S.remove(st3);


        System.out.println(a.getById(1));

    }
}
