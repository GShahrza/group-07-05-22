package main.java.lesson_19.warmup;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Example1","Example2",786.5);

        System.out.println(emp1.getName());

        emp1.setName("Example2");

        System.out.println(emp1.getName());
    }
}
