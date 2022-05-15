package main.java.lesson_5.lesson;

import java.util.Scanner;

public class LoopEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        for(int i = 1; i <= 100; i++){
//            System.out.println(i);
//        }

        /*
        for (bashlangic qiymet ; shert; emeliyyat) {
            body
        }

        for ( ; ; ) {
            body
        }
         */


        int sum = 0;

        for (int i = 1; i < 100; i++) { // i = i + 1;
            sum += i; // sum = sum + i;
        }
        System.out.println(sum);

        int number = sc.nextInt();

        int product = 1;

        for (int i = 1; i <= number; i++) {
            product *= i; // product = product * i
        }
        System.out.println(product);

        int i = 0;
        for (i = 0; i < 100; i++) {

            if(i == 50){
                continue;
            }

            System.out.println(i);
        }
        System.out.println(i);

    }
}
