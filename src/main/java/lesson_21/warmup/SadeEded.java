package main.java.lesson_21.warmup;

import java.util.ArrayList;
import java.util.Scanner;

public class SadeEded {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> prime = new ArrayList<>();
        prime.add(sc.nextInt());
        prime.add(sc.nextInt());
        prime.add(sc.nextInt());
        ArrayList<Integer> mofiable = new ArrayList<>();
        mofiable.addAll(prime);
        for (Integer number : prime) {

            if (number == 0 || number == 1) {
                System.out.println("complex");
                continue;
            }
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    mofiable.remove(number);
                    System.out.println(number + "  complex");
                    break;
                }
            }
        }
       resultS(mofiable);

    }

    private static void resultS(ArrayList<Integer> mofiable) {

        for (Integer cari : mofiable
        ) {
            System.out.println(cari+" prime");
        }
    }
}
