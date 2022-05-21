package main.java.lesson_7.warmup;

import java.util.Scanner;

public class TheArithmeticMeanOfPositive {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
        }

        double sum = 0;
        int count = 0;

        for (double number : array) {
            if (number > 0) {
                sum += number;
                count++;
            }
        }

        if(count == 0) {
            System.out.println("Not Found");
        }
        else {
            System.out.printf("%.2f",sum/count);
        }
    }
}
