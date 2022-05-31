package main.java.lesson_12.lesson;

public class Programmer extends Employee{

    @Override
    public int getSalary() {
        return 2000;
    }

    @Override
    public void speak() {
        System.out.println("Programmer is speaking");
    }
}
