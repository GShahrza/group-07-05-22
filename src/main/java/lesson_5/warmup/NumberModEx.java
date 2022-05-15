package main.java.lesson_5.warmup;

import java.util.Scanner;

public class NumberModEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double number = sc.nextDouble();

        System.out.println(number == Math.ceil(number) ? "Ok" : "No");
    }
}
