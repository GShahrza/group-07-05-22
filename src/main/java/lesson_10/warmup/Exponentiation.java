package main.java.lesson_10.warmup;

import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double n = sc.nextDouble();

        System.out.printf("%.0f ", Math.pow(x,n));
    }
}
