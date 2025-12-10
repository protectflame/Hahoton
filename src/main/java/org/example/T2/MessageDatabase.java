package org.example.T2;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User u1,User u2,String text){
    Message m1 = new Message(u1,u2,text);
    messages.add(m1);
    }

    public static String showDialog(User u1, User u2){
        StringBuilder dialog = new StringBuilder();
        dialog.append("История взаимодействия между ")
                .append(u1.getUserName())
                .append(" и ")
                .append(u2.getUserName())
                .append(":\n");

        for (Message msg : getMessages()) {
            if ((u1.getUserName().equals(msg.getSender()) && u2.getUserName().equals(msg.getReceiver())) ||
                    (u2.getUserName().equals(msg.getSender()) && u1.getUserName().equals(msg.getReceiver())))
            {
                dialog.append(msg.getSender()).append(": ").append(msg.getText()).append("\n");
            }
        }

        return dialog.toString();
    }


    public static List<Message> getMessages() {
        return List.copyOf(messages);
    }
}
