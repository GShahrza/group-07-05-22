package main.java.lesson_12.lesson;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Example");
        human.setAge((short)39);

        System.out.println(human.getName());

        Employee employee = new Employee();
        employee.setName("Employe");
        employee.setSurname("Example");
        employee.setAge((short) 25);

        System.out.println(employee.getName());
        System.out.println(employee.getSalary());

        employee.walking();

        Programmer prog = new Programmer();
        prog.speak();
        System.out.println(prog.getSalary());
    }
}
