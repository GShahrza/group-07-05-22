package main.java.lesson_4.warmup;

import java.util.Scanner;

public class DeleteOneDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int one = number/100;
        int two = number/10%10;
        int three = number%10;

        if(one >= two && two >= three){
            System.out.println(one + "" + two);
        }
        else if(one  >= two && three >= two){
            System.out.println(one + "" + three);
        }
        else {
            System.out.println(two + "" + three);
        }
    }
}
