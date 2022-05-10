package main.java.lesson_3.lesson;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int number = sc.nextInt();
//
//        switch (number) {
//            case 1 : { // number == 1
//                System.out.println("Bazar ertesi");
//                break;
//            }
//            case 2 : { // number == 2
//                System.out.println("Cershenbe axshami");
//                break;
//            }
//            case 3 : {
//                System.out.println("Chershenbe");
//                break;
//            }
//            case 7 : {
//                System.out.println("Bazar");
//                break;
//            }
//            default: {
//                System.out.println("bele bir gun yoxdur");
//                break;
//            }
//        }
//        System.out.println("emeliyyat bitdi");

        String month = sc.nextLine();

        switch (month) {
            case "Yanvar" : {
                System.out.println(1);
                break;
            }
            case "May" : {
                System.out.println(5);
                break;
            }
            case "Sentyabr" : {
                System.out.println(9);
                break;
            }
            case "Dekabr" : {
                System.out.println(12);
                break;
            }
            default: {
                System.out.println("bele bir ay yoxdur");
            }
        }

        System.out.println("The End");
    }
}
