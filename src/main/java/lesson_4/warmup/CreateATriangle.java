package main.java.lesson_4.warmup;

import java.util.Scanner;

public class CreateATriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double p = (a + b + c) / 2;

        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        if(area > 0 ) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
