package main.java.lesson_18.lesson.inner;

public class Main {
    public static void main(String[] args) {

        OuterClass.StaticNested staticNested = new OuterClass.StaticNested();

        staticNested.display();

        OuterClazz.InnerClazz innerClazz = new OuterClazz().new InnerClazz();

        innerClazz.display();
    }
}
