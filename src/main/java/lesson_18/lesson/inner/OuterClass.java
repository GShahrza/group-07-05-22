package main.java.lesson_18.lesson.inner;

public class OuterClass {

    static int outer_x = 10;

    int outer_y = 20;

    private static int outer_private = 30;

    static class StaticNested{
        void display(){
            System.out.println("outer_x = " + outer_x);

            System.out.println("outer_private = " + outer_private);
        }
    }
}
