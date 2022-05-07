package main.java.lesson_1.lesson;

import java.util.Scanner;

public class FirstLesson {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + b);
        System.out.println("-----------------------------------------");
        // type - primitive type and non-primitive type
        /*
        primitive - type :
        tam ededler - byte, short , int , long
        kesr ededler - float, double
        tek simvol uchun - char
        mentiqi tip - boolean
        non-primitive :
        String, Class'lar, Array
        /

         */

        byte x = 127;

        short s = 655;

        int i = 10;

        int i2 = 109;

        i*=10; // i = i+5, i+=1; i = i * 10
        System.out.println("first i = " + i);

        i2%=10;// i2= i2-1; i2-=1; i2 = i2/10  --  i2 = i2 % 10
        System.out.println("first i2 = " + i2);
        System.out.println(i > 10);

        System.out.println(i != i2);

        int i3 = 0;
        int i4 = 0;
        i3 = i++; // i3++;
        /*
         i3 = i -> 10;
         i = i+1 -> 11;

         */
        i4 = ++i;
        /*
            i = i+1 ->12
            i4 = i -> 12;
         */

        System.out.println("i3 = " + i3);
        System.out.println("i4 = " + i4);

        i++; // i = (i + 1); i = 11; increment
        i2--; // i2 = i2-1;

        ++i;
        --i2;
        System.out.println("i = " + i);
        System.out.println("i2 = " + i2);
        System.out.println(2 + 3567 % 10);

        System.out.println(i2 / i);

        long l = 1241251312;

        float f = 5f;

        double d = 15;

        System.out.println(d/f);
        System.out.println(i + d);

        char c = '?';

        boolean bool = true;
        boolean bool2 = false;

        String str = "word";
        String str2 = "2";

        String str3 = str + str2;
        System.out.println(str3);

        /*

         */

    }
}
