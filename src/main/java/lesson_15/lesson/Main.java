package main.java.lesson_15.lesson;

public class Main {
    public static void main(String[] args) {

//        Human p = new Person();
//
//        p.eat();
//
//        if(p instanceof Person){
//            System.out.println("this is person");
//        }
//        if(p instanceof Employee){
//            System.out.println("this is emp");
//        }
//        if(p instanceof  Human){
//            System.out.println("this is Human");
//        }

        IUser user = new User2();

        user.eat();
        user.write();

        user = null;

    }
}
