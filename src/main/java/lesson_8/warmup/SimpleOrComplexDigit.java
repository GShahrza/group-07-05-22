package main.java.lesson_8.warmup;

import java.util.Scanner;

public class SimpleOrComplexDigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m=0;
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                m++;
                break;
            }
        }
        if (n==0){
            System.out.println("Daxil edilən ədəd 0-dır.");
        }
        else if (m>0){
            System.out.println("Daxil edilən MÜRƏKKƏB ədəddir.");
        }
        else{
            System.out.println("Daxil edilən ədəd SADƏ ədəddir.");
        }
    }
}
