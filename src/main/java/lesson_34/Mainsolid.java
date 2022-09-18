package main.java.lesson_34;

import java.util.function.Predicate;

public class Mainsolid {

    public static void main(String[] args) {
        Predicate<String> nameCheck = a->a.startsWith("S");
        nameCheck.test("Salam");

    }
}
class Student extends RuntimeException{
    String name;
    String surname;
    int age;
    University nameOfUni;

    public  Student(String name , String surname ,  int age, String uniName){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.nameOfUni= new University(uniName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
class  University{
String uniName;

    public University(String uniName) {
        this.uniName = uniName;
    }
}
