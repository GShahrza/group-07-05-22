package main.java.lesson_27.lesson;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {


        flatMapExp();
        Supplier<Integer> supplier2 = () -> new Random().nextInt(10);
        Integer reduce = Stream.generate(supplier2).limit(10).peek(System.out::println).reduce(10, (a, b) -> a + b);
        Integer reduce2 = Stream.of(1, 2, 3, 4, 5).reduce(10, (a, b) -> a + b);

//        Stream.of(1,2,3,4,3).collect(Collectors.toSet());
//        Stream.of(5, 9, 3, 4, 5, 6, 7, 8, 9).filter(a -> a % 2 == 0).skip(2).forEach(System.out::print);

        System.out.println(reduce);
//        System.out.println(reduce2);

        Optional<Integer> first = Stream.generate(supplier2).findAny();
        Optional<Object> any = Stream.empty().findAny();
//        System.out.println(any.orElseGet(()->"Str"));
        System.out.println(any.orElse("Hecne yoxdu"));
        ;
        System.out.println("Birnci deyer: " + first.get());
        ;


//        long count = Stream.generate(supplier).limit(7).count();

//        System.out.println(count);
        long count1 = Stream.of(1, 2, 3, 4, 5).count();
        System.out.println(count1);

    }

    static void flatMapExp() {

        List<String> zero = List.of();
        var one = List.of("Bonobo");
        var two = List.of("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);
        Function<List<String>,Stream<String>> adfd= m->m.stream() ;

//        animals.flatMap(m -> m.stream()).forEach(System.out::println);

    }

}





