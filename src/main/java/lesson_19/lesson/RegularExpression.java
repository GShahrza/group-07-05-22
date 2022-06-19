package main.java.lesson_19.lesson;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {

//        Pattern pattern = Pattern.compile("[^abc]");
//        Matcher matcher = pattern.matcher("zs");

//        Pattern pattern = Pattern.compile("[^a-zA-Z]");
//        Matcher matcher = pattern.matcher("zs1");
//        System.out.println(matcher.find());

//        String s = "1231241";
//        String regex = "[0-9]";
//        System.out.println(s.matches("\\d+")); // [0-9]+

        String username  = new Scanner(System.in).next();

        String regex = "^(?=[a-zA-Z0-9._]{8,20}$)(?!.*[_.]{2})[^_.].*[^_.]$";

        System.out.println(username.matches(regex));
    }
}
