package main.java.lesson_21.lesson;

import java.util.LinkedList;
import java.util.List;

public class LocalDateExample {

    public LocalDateExample(int qw) {
    }

    public static void main(String[] args) {

        LinkedList<String> sd= new LinkedList<>();
        sd.add("a");
        sd.add("b");
        sd.add("c");
        sd.add("d");
        System.out.println(sd);
        System.out.println(sd.peek());
        System.out.println(sd);
        System.out.println(sd.poll());
        for (String a:sd) {
            System.out.println(a);

        }
        for (int i = 0; i <sd.size() ; i++) {
            System.out.println(sd.get(i));
        }
        sd.forEach(a-> System.out.println(a));

        sd.pop();
        sd.poll();
        System.out.println(sd);

        List<String> asd= new LinkedList<>();
        asd.add("a");
        asd.add("b");
        asd.add("c");
        asd.add("e");
        asd.add("f");
        System.out.println(asd);

    }

    }



