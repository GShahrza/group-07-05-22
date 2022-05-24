package main.java.lesson_9.warmup;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {

            if(isArmstrong(i)){
                System.out.printf("%d ",i);
            }
        }

    }

    public static boolean isArmstrong(int number) {
        int firstNumber = number / 1000;
        int secondNumber = number / 100 % 10;
        int thirdNumber = number / 10 % 10;
        int fourthNumber = number % 10;

        int sum = (int) (Math.pow(firstNumber, 4) + Math.pow(secondNumber, 4) + Math.pow(thirdNumber, 4) +
                Math.pow(fourthNumber, 4));

        return (sum == number);
    }
}
