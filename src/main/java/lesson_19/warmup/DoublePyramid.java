package main.java.lesson_19.warmup;

import java.util.Scanner;

public class DoublePyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        firstStars(n);
        secondStars(n);
        
    }
    
    public static void firstStars(int n){
        int countSpace = n-1;
        int countStar = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < countSpace; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < countStar; j++) {
                System.out.print("*");
            }
            System.out.println();
            countSpace--;
            countStar+=2;
        }
    }

    public static void secondStars(int n){
        int countSpaces = 0;
        int countStars = 2*n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < countSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < countStars; j++) {
                System.out.print("*");
            }
            System.out.println();
            countSpaces++;
            countStars-=2;
        }
    }
}
