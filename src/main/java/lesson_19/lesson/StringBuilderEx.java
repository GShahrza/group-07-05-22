package main.java.lesson_19.lesson;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("example");

        str.append("2131");

        System.out.println(str);

        String st = "example";

        st.concat("2131");

        System.out.println(st);

        StringBuffer bf = new StringBuffer("askfa  ");

        bf.trimToSize();

        System.out.println(bf);
    }
}
