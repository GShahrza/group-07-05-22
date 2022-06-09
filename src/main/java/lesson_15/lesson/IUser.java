package main.java.lesson_15.lesson;

public interface IUser{

    void eat();

    void write();

    void walk();

    default void example2(){
        System.out.println("deafult example 2");
    }

    static void example3(){
        System.out.println("example3");
    }
}
