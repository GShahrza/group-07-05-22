package main.java.lesson_27.warmup;

public final class Example {


}

class Main {


    int a = 5;
    int c = a;
    public Main(int b) {

        System.out.println("Constructor");
//        ab = b;
    }
    {
        ab=9;

        System.out.println("Instance initializer block");


    }
    final int ab;

    static {
        cd= 10;
        System.out.println("Static initializer block");
    }
    final static int cd;
    static int a1=4;






}

class A {

    static {
        System.out.println("Main olan xlass statik");
    }

    {

        System.out.println("Main olan xlass statik ionstance");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        Main m = new Main(4);
        System.out.println(m.ab);
        System.out.println(Main.cd);
    }

}
