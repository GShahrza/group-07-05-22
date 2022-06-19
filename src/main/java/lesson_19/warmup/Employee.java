package main.java.lesson_19.warmup;

public class Employee extends Person{

    private double salary = 5.5;

    public Employee(String name, String surname,double salary) {
        super(name,surname); //new Person(name,surname)
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }


}
