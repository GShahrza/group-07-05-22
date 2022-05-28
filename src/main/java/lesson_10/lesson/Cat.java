package main.java.lesson_10.lesson;

public class Cat {
    public String name; // method area
    String gender;
    public int age;


    public Cat(){
        System.out.println(gender);
        System.out.println("create Cat Object");
    }

    public Cat(String name){
        this.name = name;
    }

    public Cat(String name, String gender, int age){
        this(name);
        this.gender = gender;
        this.age = age;
    }

//    public Cat(String name){
//        System.out.printf("create %s Object\n",name);
//    }

    public void meowing() {
        System.out.printf("%s is meowing\n",name);
    }

}
