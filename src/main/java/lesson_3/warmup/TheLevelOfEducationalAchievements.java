package main.java.lesson_3.warmup;

import java.util.Scanner;

public class TheLevelOfEducationalAchievements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if(number >= 10){
            System.out.println("High");
        }
        else if(number >= 7){
            System.out.println("Sufficient");
        }
        else if(number >= 4){
            System.out.println("Average");
        }
        else{
            System.out.println("Initial");
        }
    }
}
