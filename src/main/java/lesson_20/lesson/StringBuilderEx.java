package main.java.lesson_20.lesson;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();

        str.append("example");
        str.insert(2,"ex");
        System.out.println(str);

    }
}
