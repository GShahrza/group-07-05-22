package main.java.lesson_12.lesson;

public class Human {

    private String name;
    private String surname;
    private short year;
    private short age;

    public Human() {
    }

    public Human(String name, String surname, short year, short age, short salary) {
        this.name = name;
        this.surname = surname;
        this.year = year;
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

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public void speak() {
        System.out.println("human is speaking");
    }

    public void walking() {
        System.out.println("human is walking");
    }

}
