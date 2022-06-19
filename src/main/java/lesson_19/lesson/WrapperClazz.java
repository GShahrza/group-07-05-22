package main.java.lesson_19.lesson;

import java.io.ObjectInput;

public class WrapperClazz {
    public static void main(String[] args) {

        int a = 5;

        Integer a2 = a;
        Integer a3 = 127;

        int b = a3;

        String s = a3.toString();

        System.out.println(a2.equals(a3));
        System.out.println(a2==a3);

        int a5 = Integer.parseInt("567");
    }
}
