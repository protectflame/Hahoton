package org.example.T2;

import java.util.ArrayList;
import java.util.List;


public class User {
    private String userName;
    private List<String> subscriptions;
    public static List<String> users = new ArrayList<>();
    public static List<User> allUsers = new ArrayList<>();


    public static List<String> getUsers() {
        return users;
    }


    public User(String userName, List<String> subscriptions){
        this.userName = userName;
        this.subscriptions = subscriptions;
        allUsers.add(this);
        users.add(userName);

    }


    public static boolean isUsers(String userAnswer) {
        return users.contains(userAnswer);

    }
    public User(String userName){
        this.userName = userName;
        this.subscriptions = new ArrayList<>();
        users.add(userName);
        allUsers.add(this);

    }

    public String getUserName() {
        return userName;
    }
    public static User findByName(String name) {
        for (User user : allUsers) {
            if (user.getUserName().equals(name)) {
                return user;
            }
        }
        return null;
    }
    public List<String> getSubscriptions() {

        return subscriptions;
    }
    public void subscribe(User user){
        this.subscriptions.add(user.getUserName());
    }

    public boolean isSubscribed(User user){
        return this.subscriptions.contains(user.getUserName());
    }
    public static boolean isFriend(User user1,User user2){
        return user1.isSubscribed(user2) && user2.isSubscribed(user1);
    }

}
