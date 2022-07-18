package main.java.lesson_28.lesson;

import java.io.IOException;
import java.net.BindException;

public class InheritExp {
    public static void main(String[] args) {
        try { // DOES NOT COMPILE
            int amount=6,
            balans =4;
            if(amount<=balans) {
                cardaPulcix();
                balansapulyuukle();
            }
            new Exception();
        } catch (Exception e){
        System.out.println("get up");

    }
}

    private static void balansapulyuukle() {
    }

    private static void cardaPulcix() {
    }

    interface A {

    public Number hi(int s) throws IOException;
}

class B implements A {


    @Override
    public Integer hi(int a) throws BindException {
        return null;
    }
}}