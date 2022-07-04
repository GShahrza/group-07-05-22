package main.java.lesson_23.lesson;

import java.util.List;
import java.util.Scanner;

public class FunctionExercise {
    String setr;
    static  String  s="sdfg";
    String ssd="dg";

    public static void main(String[] args) {
        FunctionExercise functionExercise = new FunctionExercise();
        String b = "df";
        b.isEmpty();
//        b=b+"1";
        Fun1 fun1 = String::length;
//        Fun1 fun3 = FunctionExercise::length;
        Fun2 fun2 = cumle -> {
            System.out.println(new FunctionExercise().ssd);
            return cumle.split(" ").length;
        };

//        List<?> q = List.of("mouse", "parrot");
        var q = List.of("mouse", "parrot");
        var v = List.of("mouse", "parrot");

//        q.removeIf(String::isEmpty);
//        q.removeIf(s -> s.length() == 4);
        v.removeIf(String::isEmpty);
        v.removeIf(s -> s.length() == 4);
        Scanner sc = new Scanner(System.in);
        functionExercise.setr = sc.nextLine();
        System.out.println("Daxil edilmis setrde symbollarin sayi: " + fun2.countOfWords(functionExercise.setr));
        ;


    }

    private  int length(String s) {
        List<?> q = List.of("mouse", "parrot");
         var v = List.of("mouse", "parrot");

//         q.removeIf(String::isEmpty);
//         q.removeIf(s -> s.length() == 4);
//         v.removeIf(String::isEmpty);
//         v.removeIf(s -> s.length() == 4);
        return "setr.length()".length();
    }
}


@FunctionalInterface
interface Fun1 {
    int countOfSymbol(String word);
}

@FunctionalInterface
interface Fun2 {
    int countOfWords(String sentence);
}
