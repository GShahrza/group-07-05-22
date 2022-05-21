package main.java.lesson_7.warmup;

import java.util.Scanner;

public class NeighborsOfTheSameSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] >= 0 && arr[i-1] >= 0){
                System.out.printf("%d %d\n",arr[i-1],arr[i]);
            }
            else if(arr[i] < 0 && arr[i-1] < 0){
                System.out.printf("%d %d\n",arr[i-1],arr[i]);
            }
        }
    }
}
