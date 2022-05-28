package main.java.lesson_10.lesson;

public class Main {
    public static void main(String[] args) {

//        Cat cat = new Cat("Leo");

        Cat cat = new Cat("Leo","male",4);
        System.out.println(cat.name);
        System.out.println(cat.gender);

//        Cat alf = new Cat("Alf");
        Cat alf = new Cat("Alf","male",10);
        alf.name = "Alf";
        System.out.println(alf.name);

        cat.meowing();
        alf.meowing();
    }
}
