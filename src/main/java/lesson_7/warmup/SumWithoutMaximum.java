package main.java.lesson_7.warmup;

import java.util.Scanner;

public class SumWithoutMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int max = arr[0];

        for(int number : arr){
            if(max < number){
                max = number;
            }
        }

        for (int number : arr) {
            if (number == max) {
                continue;
            }
            sum += number;
        }

        System.out.println(sum);

    }
}
