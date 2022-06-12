package main.java.lesson_17.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class SimplePrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1;
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = number++;
            }
        }

//        System.out.println(Arrays.deepToString(arr));

        for (int[] array : arr) {
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

    }
}
