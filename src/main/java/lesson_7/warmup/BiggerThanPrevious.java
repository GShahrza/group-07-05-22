package main.java.lesson_7.warmup;

import java.util.Scanner;

public class BiggerThanPrevious {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1] > arr[i]){
                System.out.printf("%d ",arr[i+1]);
            }
        }
    }
}
