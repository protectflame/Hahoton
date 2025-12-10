package org;
import org.service.StudentManager;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList <Student> S = new ArrayList<>();
        StudentManager a = new StudentManager();

        // прописываем поля класса для студентов
        Student st1 = new Student("Алиев Шамиль", 17, new ArrayList<String>());
        Student st2 = new Student("Омаев Магомед", 18, new ArrayList<String>());
        Student st3 = new Student("Насрулаева Айзар", 17, new ArrayList<String>());
        Student st4 = new Student("Магомедов Магомед", 20, new ArrayList<String>());
        Student st5 = new Student("Мужлатов Ибрагим", 16, new ArrayList<String>());
        Student st6 = new Student("Кабельхановна Марьям", 18, new ArrayList<String>());


        // добавляем студентов
        a.add(st1);
        a.add(st2);
        a.add(st3);
        a.add(st4);
        a.add(st5);
        a.add(st6);

        //a.remove(1);

        // вывод по возрасту(диапозон)
        System.out.println(a);

       //System.out.println(a);



    }
}
