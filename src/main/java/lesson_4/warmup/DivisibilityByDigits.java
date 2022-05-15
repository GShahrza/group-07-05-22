package main.java.lesson_4.warmup;

import java.util.Scanner;

public class DivisibilityByDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int firstNumber = number / 1000;
        int secondNumber = number / 100 % 10;
        int thirdNumber = number / 10 % 10;
        int fourthNumber = number % 10;

        if(firstNumber == 0 || secondNumber == 0 || thirdNumber == 0 || fourthNumber == 0){
            System.out.println("NO");
        }
        else {
            if(number % firstNumber == 0 && number % secondNumber == 0 && number % thirdNumber == 0 &&
                    number % fourthNumber == 0){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
