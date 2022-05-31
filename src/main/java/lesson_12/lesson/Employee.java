package main.java.lesson_12.lesson;

public class Employee extends Human{
    //Human superclass
    //Employee subclass


    public int getSalary(){
        return 1000;
    }

    @Override
    public void walking() {
        System.out.println("employee is walking");
    }
}
