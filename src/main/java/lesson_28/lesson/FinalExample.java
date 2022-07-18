package main.java.lesson_28.lesson;

public class FinalExample {
    public static void main(String[] kn) {
        System.out.println(new FinalExample().goHome());

//        StringBuilder sb = new StringBuilder();
//        try {
//            sb.append("t");
//            throw new ArithmeticException();
//        } catch (NullPointerException e) {
//            sb.append("c");
//        } finally {
//            sb.append("f");
//            System.out.println(sb);
//        }
//        sb.append("a");
//        System.out.print(sb.toString());
    }

    int goHome() {

        try {
            int a=9/0;
            System.out.print("1");
            return -1;
        } catch (Exception e) {
            System.out.print("2");
            return -2;
        } finally {
            System.out.print("3");
            return -3;
        }
    }
}