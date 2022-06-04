package main.java.lesson_13.warmup.dao.respository;

import main.java.lesson_13.warmup.dao.model.User;

public class UserRepository {

    private static int count = 0;
    public static User[] users = new User[100];

    public static void addUser(User user){
        users[count] = user;
        count++;
    }
}
