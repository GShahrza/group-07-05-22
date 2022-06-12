package main.java.lesson_13.warmup.dao.respository;

import main.java.lesson_13.warmup.dao.model.User;

import java.util.Arrays;

public class UserRepository {

    public static User[] users = {};

    public static void addUser(User user){
        User[] newUsers = Arrays.copyOf(users,users.length+1);
        newUsers[users.length] = user; // newUsers[newUsers.length-1] = user
        users = newUsers;
    }

    public static void delete(User user){
        User[] newUsers = new User[users.length-1];

        for (int i = 0,j=0; i < users.length; i++) {
            if(users[i] != user){
                newUsers[j++] = user;
            }
        }
        users = newUsers;
    }

    public static void update(User user,int index){
        if(index < 0 || index >= users.length){
            System.out.println("User Not found!");
        }else {
            users[index] = user; //users[3] = user; //arr[5] = 1;
        }
    }

    public static void getAll(){
        for (User user: users) {
            System.out.println(user);
        }
    }
}
