package main.java.lesson_25.lesson;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredricateExp {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("tree");
        arrayList.add("one");

        Predicate<ArrayList<String>> predicate= a->a.get(0).equals("one");

//        System.out.println(predicate.test("mone"));
//        arrayList.removeIf(predicate);
        arrayListOperation(predicate, arrayList);

        System.out.println(arrayList);



    }

    private static void arrayListOperation(Predicate<ArrayList<String>> predicate, ArrayList<String> arrayList) {

        predicate.test(arrayList);
    }
}
