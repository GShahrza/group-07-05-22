package main.java.lesson_22.lesson;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TestIterable {

    public static void main(String[] args) {
        List<User> stringList = new ArrayList<>();
        stringList.add(new User("Emil", "Hesenov"));
        stringList.add(new User("Gunel", "Mustafayeva"));
        Iterator<User> iterator = stringList.iterator();
        while (iterator.hasNext()){
            User element = iterator.next();
            if(element.getName().equalsIgnoreCase("emil")){
                element.setName("Ramim");
            }
            System.out.println(element);
        }



        stringList.forEach((User user)->{
            System.out.println(user);
            return;
        });



        System.out.println(stringList);

    }

    public void out(User user){
        System.out.println(user);
    }






    }

class  User{
    private String name;
    private String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
