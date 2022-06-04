package main.java.lesson_13.lesson;

public class User {

    public static String info = "once info";
    private String name;
    private String surname;
    private int age;

    static {
        System.out.println("for static block");
    }

    {
        System.out.println("for non-static block");
    }

    public User() {
    }

    public User(String name, String surname, int age) {
        System.out.println("for contructor");
        this.name = name;
        this.surname = surname;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
