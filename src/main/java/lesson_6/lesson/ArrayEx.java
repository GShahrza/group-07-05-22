package main.java.lesson_6.lesson;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = {20,5,25,10};

//        int[] arrTwo = new int[]{1,2,3,4,5};

//        int[] arrTwo = new int[n];
//        arrTwo[0] = sc.nextInt();
//        arrTwo[1] = 4;
//        arrTwo[2] = 3;
//
//        System.out.println(arrTwo[4]);

        int[] arrTwo = new int[n];

        for (int i = 0; i < n; i++) {
            arrTwo[i] = sc.nextInt();
        }

//        for (int i = 0; i < n; i++) {
//            System.out.println(arrTwo[i]);
//        }

        System.out.println(arrTwo);
        System.out.println(Arrays.toString(arrTwo));
    }

    /*
        istifadeci eded daxil edir, onun bolenleri tapilir

        eded daxil edilir,  sade ve ya murekkeb olmasi yoxlanilir
     */
}
