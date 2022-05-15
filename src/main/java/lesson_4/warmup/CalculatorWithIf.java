package main.java.lesson_4.warmup;

import java.util.Scanner;

public class CalculatorWithIf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci ededi daxil edin: ");
        double numberOne = sc.nextDouble();

        System.out.print("Ikinci ededi daxil edin: ");
        double numberTwo = sc.nextDouble();

        System.out.print("Emeliyyati daxil edin (+, -, *, /): ");

        char operation = sc.next().charAt(0);

        if( operation == '+'){
            System.out.println("numberOne + numberTwo = " + (numberOne + numberTwo));
        }
        else if( operation == '-'){
            System.out.println("numberOne - numberTwo = " + (numberOne - numberTwo));
        }
        else if(operation == '*'){
            System.out.println("numberOne * numberTwo = " + (numberOne * numberTwo));
        }
        else if(operation == '/'){
            System.out.println("numberOne / numberTwo = " + (numberOne / numberTwo));
        }
        else {
            System.out.println("Bele bir emeliyyat mumkun deyil");
        }
    }
}
