package main.java.lesson_2.lesson;

import java.util.Scanner;

public class ConditionalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) { //true 5 > 10 --and && --or ||
            System.out.println(a - b);
        }
        else if(a == b) {
            System.out.println(a * b);
        }
        else if (a % 2 == 0) {
            System.out.println("a cut ededir");
        }
        else if(a == 5){
            System.out.println("a == 5");
        }
        else {
            System.out.println(a + b);
        }

        String str1 = "word";
        String str2 = "word";
        System.out.println(str1 == str2);

//        if( a <= b) { //true
//            System.out.println(a * b);
//        }

    }
}
