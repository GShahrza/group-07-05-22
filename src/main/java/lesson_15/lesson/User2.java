package main.java.lesson_15.lesson;

public class User2 implements IUser{
    @Override
    public void eat() {
        System.out.println("eat2");
    }

    @Override
    public void write() {
        System.out.println("write2");
    }

    @Override
    public void walk() {
        System.out.println("walk2");
    }
}
