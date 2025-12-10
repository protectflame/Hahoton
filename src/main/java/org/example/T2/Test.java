package org.example.T2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args)  {

        User user1 = new User("Пользователь1");
        User user2 = new User("Пользователь2");
        User user3 = new User("Пользователь3");


        MessageDatabase.sendMessage(user1, user2, "Привет от Пользователя1 (1)");
        MessageDatabase.sendMessage(user1, user2, "Как дела? (2)");

        MessageDatabase.sendMessage(user2, user1, "Привет! (1)");
        MessageDatabase.sendMessage(user2, user1, "Отлично, спасибо! (2)");
        MessageDatabase.sendMessage(user2, user1, "Что нового? (3)");

        MessageDatabase.sendMessage(user3, user1, "Здравствуйте! (1)");
        MessageDatabase.sendMessage(user3, user1, "Могу помочь? (2)");
        MessageDatabase.sendMessage(user3, user1, "Жду ответа (3)");

        MessageDatabase.sendMessage(user1, user3, "Привет от Пользователя1 (1)");
        MessageDatabase.sendMessage(user1, user3, "Всё хорошо, спасибо! (2)");
        MessageDatabase.sendMessage(user1, user3, "Нужно обсудить проект (3)");

        MessageDatabase.sendMessage(user3, user1, "Согласен, давайте завтра (4)");

        System.out.println("\n=== Диалог между Пользователь1 и Пользователь2 ===");
        System.out.println(MessageDatabase.showDialog(user1, user2));

        System.out.println("\n=== Диалог между Пользователь2 и Пользователь1 ===");
        System.out.println(MessageDatabase.showDialog(user2, user1));

        System.out.println("\n=== Диалог между Пользователь3 и Пользователь1 ===");
        System.out.println(MessageDatabase.showDialog(user3, user1));

        System.out.println("\n=== Диалог между Пользователь1 и Пользователь3 ===");
        System.out.println(MessageDatabase.showDialog(user1, user3));
        System.out.println(MessageDatabase.showDialog(user1, user3));

        Scanner sc = new Scanner(System.in);
        boolean RUN = false;
        while (RUN) {
            System.out.println("Выберите, кому написать — введите имя (ID добавим позже)");
            System.out.println("Список доступных пользователей: " + User.getUsers());
            System.out.println("Чтобы выйти, введите 'exit' или любое недопустимое имя.");

            String userInput = sc.nextLine().trim();

            if ("exit".equalsIgnoreCase(userInput)) {
                System.out.println("Выход из программы.");
                break;
            }
            if (User.isUsers(userInput)) {
                User recipient = User.findByName(userInput);
                if (recipient == null) {
                    System.out.println("Ошибка: отправитель не найден!");
                    continue;
                }
                System.out.println("Вы пишете пользователю: " + userInput);
                System.out.println("Введите сообщение:");
                String message = sc.nextLine();
                MessageDatabase.sendMessage(user1,recipient,message);
                System.out.println("Сообщение получено: \"" + message + "\"");
            } else {
                System.out.println("Пользователь '" + userInput + "' не найден. Попробуйте снова.");
            }
        }

        sc.close();


        System.out.println(MessageDatabase.showDialog(user1, user2));
        System.out.println(MessageDatabase.showDialog(user2, user1));

        }

    }