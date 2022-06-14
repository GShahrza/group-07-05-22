package main.java.lesson_18.lesson;

public class Dog extends Animal {

    public Dog(int age){
        super(age);
    }

    public Dog(){
        this(5);
    }

    @Override
    public void animalSound() {
        System.out.println("hav-hav");
    }


    @Override
    public void foo() {
        System.out.println("ex");
    }
}
