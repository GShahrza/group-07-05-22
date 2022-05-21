package main.java.lesson_7.warmup;

import java.util.Scanner;

public class DivisorsOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for (int i = 1; i < Math.sqrt(number); i++) {
            if(number % i == 0){
                System.out.print(i + " ");
            }
        }

        for (int i = (int)Math.sqrt(number); i >= 1; i--) {
            if(number % i == 0){
                System.out.print(number / i + " ");
            }
        }


    }
}
