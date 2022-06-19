package main.java.lesson_20.warmup;

import java.util.Scanner;

public class IntegerToRomanNumeral {

    public static void main(String[] args) {

        System.out.println(integerToRomanNumeral(new Scanner(System.in).nextInt()));
    }

    public static String integerToRomanNumeral(int input) {
        StringBuilder s = new StringBuilder();

        while (input >= 1) {
            if (input >= 1000) {
                s.append("M");
                input -= 1000;
            } else if (input >= 900) {
                s.append("CM");
                input -= 900;
            } else if (input >= 500) {
                s.append("D");
                input -= 500;
            } else if (input >= 400) {
                s.append("CD");
                input -= 400;
            } else if (input >= 100) {
                s.append("C");
                input -= 100;
            } else if (input >= 90) {
                s.append("XC");
                input -= 90;
            } else if (input >= 50) {
                s.append("L");
                input -= 50;
            } else if (input >= 40) {
                s.append("XL");
                input -= 40;
            } else if (input >= 10) {
                s.append("X");
                input -= 10;
            } else if (input >= 9) {
                s.append("IX");
                input -= 9;
            } else if (input >= 5) {
                s.append("V");
                input -= 5;
            } else if (input >= 4) {
                s.append("IV");
                input -= 4;
            } else if (input >= 1) {
                s.append("I");
                input -= 1;
            }

        }
        return s.toString();
    }
}
