package main.java.lesson_25.lesson;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerExp {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("tree");
        arrayList.add("one");

        Consumer<String> stringConsumer = a -> {
            a = a + a.length();
            System.out.println(a);
        };

        arrayList.forEach(stringConsumer);
    }
}
