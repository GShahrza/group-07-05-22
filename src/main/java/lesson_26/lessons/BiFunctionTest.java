package main.java.lesson_26.lessons;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BiFunctionTest {

    public static void main(String[] args) {
        Stream<String> stringStream = List.of("a", "b", "c").stream();

        Optional<String> stringOptional= Optional.ofNullable(null);

        String s = stringOptional.orElse("workbook");
        stringStream.count();
        Stream<String> f = stringStream.map(x -> x.concat("f"));
        f.forEach(System.out::println);



        List<Integer> collect = List.of(1, 2, 3).stream().filter(a -> a > 2).collect(Collectors.toList());
        System.out.println(collect);



        IntStream randomStream = IntStream.generate(new Random()::nextInt).limit(10L);
//        randomStream.forEach(System.out::println);


        BiFunction<String,String,Boolean> startWith = String::startsWith;
        System.out.println( startWith.apply("hello", "h"));
        BiPredicate<String,String> startwith= String::startsWith;
        System.out.println( startwith.test("hello", "h"));

        BinaryOperator<String> concatbi= String::concat;
        BiFunction<String,String,String> concatfu = String::concat;

        System.out.println(concatbi.apply("a","b"));
        System.out.println(concatfu.apply("a","b"));

    }

   

}
