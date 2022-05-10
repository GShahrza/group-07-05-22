package main.java.lesson_3.warmup;

import java.util.Scanner;

public class HotelRooms {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        System.out.println((n-1) * m * 3);
    }
}
