package main.java.lesson_6.lesson;

import java.util.Scanner;

public class WhileEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        if (shert) {
            //body
        }
        while (shert){
            body
        }
         */
//        int i = 1;
//        while (i <= 100) {
//            System.out.println(++i);
//        }

//        int sum = 0;
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int i = a;
//
//        while (i <= b){
//            sum += i;
//            i++;
//        }
//        System.out.println(sum);

//        int fact = 1;
//        int number = sc.nextInt();
//        int i = 1;
//        while (i <= number) {
//            fact *= i;
//            i++;
//        }
//        System.out.println(fact);
//


        int i = 10;

        int number = sc.nextInt();

        /*
            do {
                body
            }while (shert);
         */

        do {
            System.out.println("Proqram bashladi");
            System.out.println("------------");
            System.out.println("Proqram basha chatdi");
            i++; // 11
        }while (i < number);
    }
}
