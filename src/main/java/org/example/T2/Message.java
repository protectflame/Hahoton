package org.example.T2;

import java.util.Date;

public class Message {
    private final User sender;
    private final User receiver;
    private final String text;
    private final Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        date = new Date();
    }

    public String  getSender() {
        return this.sender.getUserName();
    }

    public String  getReceiver() {
        return this.receiver.getUserName();
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "FROM: '" + getSender() +
                "'\nTO:   '" + getReceiver()   +
                "'\nON:   " + getDate() +
                "\n '" + getText() + '\'';
    }
}
