package main.java.lesson_6.warmup;

import java.util.Scanner;

public class Letter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        String vowel = "AIOUEaouei";
        //char = 123; char = '{'
        char ch = word.charAt(0);

        if(Character.isAlphabetic(ch) && word.length() == 1){
            if(vowel.indexOf(ch) != -1){ // vowel.contains(String.valueOf(ch));
                System.out.println("Input letter is Vowel");
            }
            else {
                System.out.println("Input letter is Consonant");
            }
        }
        else {
            System.out.println("error message");
        }
    }
}
