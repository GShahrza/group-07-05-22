package main.java.lesson_10.warmup;

import java.util.Scanner;

public class TheSumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int sum = 0, digit = 0;

        while (number != 0){
            digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println(sum);
    }
}
