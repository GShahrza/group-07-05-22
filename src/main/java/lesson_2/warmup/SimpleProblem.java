package main.java.lesson_2.warmup;

import java.util.Scanner;

public class SimpleProblem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int firstNumber = number / 1000;
        int secondNumber = (number / 100) % 10;
        int thirdNumber = number / 10 % 10;
        int endNumber = number % 10;

        System.out.println("First: " + firstNumber);
        System.out.println("Second: " + secondNumber);
        System.out.println("Third: " + thirdNumber);
        System.out.println("End: " + endNumber);
    }
}
