package main.java.lesson_20.lesson;

import java.util.Scanner;

public class ReverseEx {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        String str = new Scanner(System.in).nextLine();

        System.out.println("reverse string: " + reverse(str));
    }

    public static String reverse(String input){
        StringBuilder reverseInput = new StringBuilder();

        for (int i = input.length()-1; i >= 0 ; i--) {
            reverseInput.append(input.charAt(i));
        }
        return reverseInput.toString();
    }
}
