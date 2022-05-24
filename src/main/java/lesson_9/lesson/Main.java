package main.java.lesson_9.lesson;

public class Main {
    public static void main(String[] args) {

        Person shahrza = new Person();

        shahrza.run();

        System.out.println(shahrza.name);

        Person emil = new Person();

        emil.name = "Emil";
        System.out.println(emil.name);

        Person gunel = new Person();
        gunel.name = "Gunel";
        System.out.println(gunel.name);

        System.out.println(gunel.age);


        Car car = new Car();
        car.countDoor = -2;
//        String personName = Person.name;
//        System.out.println(personName);
//        System.out.println(Person.surname);
//
//        Person.run();
    }
}
