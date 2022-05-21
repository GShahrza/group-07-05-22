package main.java.lesson_7.lesson;

import java.util.Scanner;

public class MethodEx {

    public static void main(String[] args) {

        call();

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

//        for (int i = 3; i <= number; i++) {
//            factorial = factorial(i);
//            System.out.println(factorial + " ");
//        }

        for (int i = 3; i <= number ; i++) {
            factorialTwo(i);
        }

//        System.out.println(message());
        String message = message();
        System.out.println(message);

    }
    //access modifier / non-access modifier / return type / method name/ parameter

    // return type'i olan ve parameter qebul eden
    public static int factorial(int number) {
        int product = 1;

        for (int i = 1; i <= number; i++) {
            product *= i;
        }
        System.out.println("factorial methodu ishleyior");
        return product;
    }

    //return type'i olan amma parameter qebul etmeyen
    public static String message(){
        return "\nProqram sona chatdi";
    }

    // return typei olmayan ve parameter qebul eden
    public static void factorialTwo(int number){
        int product = 1;

        for (int i = 1; i <= number; i++) {
            product *= i;
        }
        System.out.print(product + " ");
    }

    // return type'i olmayan ve parameter qebul etmeyen
    public static void call(){
        System.out.println("Proqram ishe dushdu");
    }
}
