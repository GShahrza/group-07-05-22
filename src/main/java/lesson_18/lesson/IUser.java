package main.java.lesson_18.lesson;

public interface IUser {

    default void add(){
        System.out.println("add user with Interface");
    }
}
