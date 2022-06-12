package main.java.lesson_17.warmup;

import java.util.Scanner;

public class NByNMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1;
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++, number++) {
                arr[i][j] = number;
            }
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.printf("|%-3s", anInt);
            }
            System.out.print("|\n");
        }
    }
}
