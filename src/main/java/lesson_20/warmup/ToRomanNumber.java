package main.java.lesson_20.warmup;
import java.util.Arrays;
import java.util.Scanner;

public class ToRomanNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        toRomanNumber(n);
    }
    public static void toRomanNumber(int n){
        int[] arr = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int num = 0;
        int count = 0;
        int[] newArr = new int[count];
        for (int k : arr) {
            num = n / k * k;
            n = n - num;
            if (num != 0) {
                count++;
                newArr = Arrays.copyOf(newArr, count);
                newArr[newArr.length - 1] = num;
            }
        }

        for (int k : newArr) {
            if (k >= 1000) {
                int m = k / 1000;
                for (int j = 0; j < m; j++) {
                    System.out.print("M");
                }
            } else if (k >= 900) {
                System.out.print("CM");
            } else if (k >= 500) {
                System.out.print("D");
            } else if (k >= 400) {
                System.out.print("CD");
            } else if (k >= 100) {
                int m = k / 100;
                for (int j = 0; j < m; j++) {
                    System.out.print("C");
                }
            } else if (k >= 90) {
                System.out.print("XC");
            } else if (k >= 50) {

                System.out.print("L");

            } else if (k >= 40) {
                System.out.print("XL");
            } else if (k >= 10) {
                int m = k / 10;
                for (int j = 0; j < m; j++) {
                    System.out.print("X");
                }
            } else if (k >= 9) {
                System.out.print("IX");
            } else if (k >= 5) {
                System.out.print("V");
            } else if (k >= 4) {
                System.out.print("IV");
            } else if (k >= 1) {
                int m = k;
                for (int j = 0; j < m; j++) {
                    System.out.print("I");
                }
            }
        }
    }
}
