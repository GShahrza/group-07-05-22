package main.java.lesson_10.warmup;

import java.util.Scanner;

public class Function10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(function(m, n));
    }

    public static int function(int m,int n){

        if(m > 0 && m < n){
            return function(m-1,n-1) + function(m,n-1);
        }
        if(m == 0){
            return 1;
        }
        else if(m == n){
            return 1;
        }
        else {
           return  0 + function(m-1,n-1) + function(m,n-1);
           // 3,1
            //
        }
    }
}
