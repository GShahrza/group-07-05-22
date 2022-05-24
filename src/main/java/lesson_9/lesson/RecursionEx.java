package main.java.lesson_9.lesson;

import java.util.Scanner;

public class RecursionEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.printf("Factorial 5: %d ",factorial(number));

    }

    public static int factorial(int number){

        if(number == 1){
            return 1;
        }
        else {
            System.out.println(number);
            System.out.println(number * factorial(number));
            return number * factorial(number);
            // 5 * 4 * 3 * 2 * 1;
        }
    }
}
