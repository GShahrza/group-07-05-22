package main.java.lesson_27.lesson;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Student {
    public String name;
    public String surname;

    List<Integer> marks = new ArrayList<>();

    public Student(String name, String surname, List<Integer> marks) {
        this.name = name;
        this.surname = surname;
        this.marks = marks;
    }
}

class Main1{
    public static void main(String[] args) {
       Student student1 = new Student("Emil","Hasanov",List.of(50,75,100));
       Student student2 = new Student("Ayaz","Samadov",List.of(40,65,100));
       Student student3 = new Student("Tayson","Muradov",List.of(35,85,100));

        Integer reduce = Stream.of(student1.marks,student2.marks,student3.marks).flatMap(Collection::stream).reduce(0,(a,b)->(a+b)/2);
       List<Student>studentList = List.of(student1,student2,student3);
        System.out.println(reduce);
//       studentList.stream().flatMap(student -> student.marks)
    }


}
