package main.java.lesson_22.lesson;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
public class Translate {


     static Map<String, String> dictionary=  Map.ofEntries(Map.entry("hello", "salam") ,Map.entry( "book", "kitab"));

    public static void main(String[] args) {
String sdf="hello jhon";
        String[] s = sdf.split(" ");


        Scanner sc= new Scanner(System.in);

        wordTranslateEnToAz(sc.next());
    }

    private static void wordTranslateEnToAz(String next) {
        System.out.println(dictionary.getOrDefault(next,"This word not found in dictionary"));

    }
}
