package main.java.lesson_11.lesson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Car bmw = new Car();

        bmw.setDoor(sc.nextInt());

        System.out.println(bmw.getDoor());

    }
}
