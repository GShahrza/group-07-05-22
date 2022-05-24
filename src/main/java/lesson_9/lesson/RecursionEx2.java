package main.java.lesson_9.lesson;

public class RecursionEx2 {

    public static int count = 1;

    public static void main(String[] args) {
        hello();
        System.out.println(count);
    }

    public static void hello(){
        if(count <= 5) {
            System.out.printf("%d %s", count, "hello\n");
        }
        else{
            return;
        }
        count++;
        hello();
    }
}
