package main.java.lesson_7.lesson;

import java.util.Scanner;

public class CalculatorEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        char ch = sc.next().charAt(0);

        if(ch == '+'){
            sum(a,b);
        }
        else if(ch == '-'){
            System.out.println(subtract(a, b));
        }
        else if(ch == '*'){
            product(a,b);
        }
        else if(ch == '/'){
            System.out.println(divide(a, b));
        }
    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }

    public static int subtract(int a, int b){
        return a-b;
    }

    public static void product(int a,int b){
        System.out.println(a*b);
    }

    public static double divide(int a,int b){
        return a/b;
    }
}
