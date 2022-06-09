package main.java.lesson_15.lesson;


public class Calculator {
    public static void main(String[] args) {
        sum(5,7);

        sum(5,6,7);
    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }

    public static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void sum(double a, double b){
        System.out.println(a+b);
    }
}
