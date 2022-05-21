package main.java.lesson_7.lesson;

import java.util.Scanner;

public class Array2DEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int column = sc.nextInt();
        int raw = sc.nextInt();

        int[][] array = new int[raw][column];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[raw].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int[] arr = {1, 2, 3, 5};

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    }
}
