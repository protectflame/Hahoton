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


        Student st4 = new Student("Магомедов Магомед", 21, new ArrayList<String>());
        Student st5 = new Student("Мужлатов Ибрагим", 14, new ArrayList<String>());
        Student st6 = new Student("Кабельхановна Марьям", 18, new ArrayList<String>());

        S.add(st4);
        S.add(st5);
        S.add(st6);
        S.add(st1);


        a.add("Насрулаева Айзар", 17, new ArrayList<String>());
        a.add("Омаев Магомед", 18, new ArrayList<String>());
        a.add(st1);


        System.out.println(a.filterByAge(S, 17, 20));


    }
}
