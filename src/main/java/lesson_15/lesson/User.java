package main.java.lesson_15.lesson;

public class User implements IUser{

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void write() {
        System.out.println("write");
    }

    @Override
    public void walk() {
        System.out.println("walk");
    }

    public void test(){
        System.out.println("test");
    }

    @Override
    public void example2() {
        IUser.super.example2();
    }

}
