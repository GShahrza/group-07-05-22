package main.java.lesson_5.warmup;

import java.util.Scanner;

public class ReplaceEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        word = word.replace("x"," ")
                .trim()
                .replace(" ","x");
        System.out.println(word);

        String word1 = "example";
        String word2 = "example";

        System.out.println(word1 == word2);
    }
}
