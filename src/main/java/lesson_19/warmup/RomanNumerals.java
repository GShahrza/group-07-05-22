package main.java.lesson_19.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Roma reqemini daxil et:");
        String rn = sc.next();

        System.out.printf("Daxil edilen roma reqemi ( %s )  - %d ededini gosterir",rn,result(stringToNumArray(rn)));

    }

    public static int[] stringToNumArray(String rn) {
        String[] arr = rn.split("");
        int count = 0;
        int[] newArr = new int[count];
        for (String s : arr) {
            if (s.equalsIgnoreCase("I")) {
                count++;
                newArr = Arrays.copyOf(newArr, count);
                newArr[newArr.length - 1] = 1;
            } else if (s.equalsIgnoreCase("V")) {
                count++;
                newArr = Arrays.copyOf(newArr, count);
                newArr[newArr.length - 1] = 5;
            } else if (s.equalsIgnoreCase("X")) {
                count++;
                newArr = Arrays.copyOf(newArr, count);
                newArr[newArr.length - 1] = 10;
            } else if (s.equalsIgnoreCase("L")) {
                count++;
                newArr = Arrays.copyOf(newArr, count);
                newArr[newArr.length - 1] = 50;
            } else if (s.equalsIgnoreCase("C")) {
                count++;
                newArr = Arrays.copyOf(newArr, count);
                newArr[newArr.length - 1] = 100;
            } else if (s.equalsIgnoreCase("D")) {
                count++;
                newArr = Arrays.copyOf(newArr, count);
                newArr[newArr.length - 1] = 500;
            } else if (s.equalsIgnoreCase("M")) {
                count++;
                newArr = Arrays.copyOf(newArr, count);
                newArr[newArr.length - 1] = 1000;
            }

        }
        return newArr;
    }

    public static int result(int[] newArr){

        int result = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (i < newArr.length - 1 && newArr[i] < newArr[i + 1]) {
                result = result + (newArr[i + 1] - newArr[i]);
                i++;
            } else {
                result = result + newArr[i];
            }
        }
        return result;
    }

}
