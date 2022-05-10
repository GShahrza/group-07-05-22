package main.java.lesson_3.lesson;

public class MathExample {
    public static void main(String[] args) {

//        int a = 25;

//        System.out.println(Math.abs(a));

//        double b = Math.sqrt(a);
//
//        int c = (int) b;
//
//        double dc = c;
//        System.out.println(dc);
//        double b = Math.pow(a,2);
//        System.out.println(Math.pow(a,2));

        String str = "1525";

        System.out.println(str + 5);

        int number = Integer.parseInt(str);

        System.out.println(number + 5);

        double d = Double.parseDouble(str);
        System.out.println(d);

        String str2 = String.valueOf(d);
        System.out.println(str2 + 3);
    }
}
