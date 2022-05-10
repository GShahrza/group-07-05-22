package main.java.lesson_3.lesson;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

//        if(a > 10){
//            a *= 2; // a = a * 2;
//        }else{
//            a *= 3; // a = a * 3;
//        }
        // variable = shert ? true : false;  // ctrl + alt + l - clean code
        a = a > 10 ?
                a * 2 :
                a == 10 ?
                        a :
                        a * 3;

        System.out.println(a);


    }
}
