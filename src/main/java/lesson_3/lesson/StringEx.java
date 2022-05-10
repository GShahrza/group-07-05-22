package main.java.lesson_3.lesson;

import java.util.Scanner;

public class StringEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        String str = "EXAMPLE";
//        String str2 = "Example";
//
//        String str3 = new String("Example"); // new hemishe obyekt yaradir

//        System.out.println(str == str2);
//        System.out.println(str == str3); false
//        System.out.println(str.equals(str3));

//        str.toLowerCase();
//        System.out.println(str);
//        str = str.toLowerCase();
//        System.out.println(str);
//
//        str.toUpperCase();
//        System.out.println(str);
//        str = str.toUpperCase();
//        System.out.println(str);
//

        String answer = sc.nextLine();

//        if(answer.equalsIgnoreCase("yes")){
//            System.out.println(answer.concat(" sizin cavabinizdir"));
//        }
//        else if(answer.equalsIgnoreCase("no")){
//            System.out.println(answer.concat(" sizin cavabinizdir"));
//        }

        if(answer.contains("y")){
            System.out.println(answer);
        }


    }
}
