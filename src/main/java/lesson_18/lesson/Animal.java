package main.java.lesson_18.lesson;

public abstract class Animal implements IAnimal{

    private int age;

    public Animal(int age){
        this.age = age;
    }

    public Animal(){
        System.out.println("constructor created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void animalSound();

    public void sleep(){
        System.out.println("Zzz");
    }

}
