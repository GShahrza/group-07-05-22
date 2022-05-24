package main.java.lesson_9.warmup;

public class LoopAHundred {
    public static void main(String[] args) {
        String str = "";
        while (str.length() != 100) {
            str = str.concat("a");
            System.out.println(str.length());
        }
    }
}
