package main.java.lesson_8.warmup;

import java.util.Scanner;

public class PrintSquaresAndCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        for (long i = a; i <= b; i++) {
            System.out.printf("%.0f ",Math.pow(i,2));
        }
        System.out.println();
        for (long i = b; i >= a ; i--) {
            System.out.printf("%.0f ",Math.pow(i,3));
        }

    }
}
