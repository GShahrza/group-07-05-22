package main.java.lesson_23.lesson;

public class FunctioanInterfa {
    public static void main(String[] args) {
        Test test1 = a -> a > 5;
        System.out.println(test1.check(3));

        Test test2= new TestImpl();
        System.out.println(test2.check(6));

        Test test3 = a -> a>5;
        System.out.println(test3.check(6));
    }
}


@FunctionalInterface
interface Test {
    boolean check(Integer a);
}

class  TestImpl implements  Test{


    @Override
    public boolean check(Integer a) {
        return a>5;
    }
}
