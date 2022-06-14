package main.java.lesson_18.lesson.inner;

public class OuterClazz {

    static int outer_x = 10;

    int outer_y = 20;

    private int outer_private = 30;

    class InnerClazz {
        void display(){

            System.out.println("outer_x = " + outer_x);

            System.out.println("outer_y = " + outer_y);

            System.out.println("outer_private = " + outer_private);
        }
    }
}
