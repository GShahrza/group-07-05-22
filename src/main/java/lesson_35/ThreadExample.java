package main.java.lesson_35;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadExample {


    static AtomicInteger counter = new AtomicInteger();

    private  static void increment() {
        for (int i = 0; i < 1000000; i++)
            counter.incrementAndGet();
        System.out.println(Thread.currentThread().getName() + " counter : " + counter.get());
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadExample threadExample = new ThreadExample();
        Thread thread1 = new Thread(() -> {
            increment();
        });

        Thread thread2 = new Thread(() -> {
            increment();
        });

        thread1.start();
//        thread1.join();
        thread2.start();
//        thread2.join();
    }

}
