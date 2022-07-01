package main.java.lesson_22.lesson;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListCopy {
    public static void main(String[] args) {


        List<String> stringList= List.of("sd","Ssd");
        List<String> strings= Arrays.asList("sfg","sd");
        List<String> sfd= List.copyOf(strings);

        Map<Integer, String> asc= new HashMap<>();
        asc.put(1,"A");
        asc.put(2,"C");
        asc.put(3,"D");
        Map<String, String> stringStringMap= Map.ofEntries(
                Map.entry("key1", "value1"),
                Map.entry("key2", "value2"));
        System.out.println(stringStringMap);
        for (Integer key :asc.keySet()) {
            System.out.println(asc.get(key));

        }

        asc.get(3);
//        asc.replace()


        //        receivedElementToConsole("sa","sda","ahjs");
//        List<String> name= List.
    }

    static void  receivedElementToConsole(String...a){
        Arrays.stream(a).forEach(System.out::println);


    }
    static void receivedElementToConsole(String sa,String we){}
}
