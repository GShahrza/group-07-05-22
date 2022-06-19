package main.java.lesson_19.warmup;

import java.util.Scanner;

public class Pyramid2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pyramidNumber(n);

    }
    public static void pyramidNumber(int n){
        int number = 1;
        int count=1;
        int space=(2*n-1)/2;

        for (int i = 0; i < n; i++) {
            for (int j = space; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < count; j++) {
                System.out.printf("%-2d ", number);
            }
            for (int j = space; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println();
            count++;
            space--;
            number++;
        }
    }

}
