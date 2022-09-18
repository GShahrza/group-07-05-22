package main.java.lesson_35;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread with main");
Thread.sleep(3000L);
        MyThread myThread= new MyThread();
        MyThread1 myThread1=new MyThread1();
        Thread withrunThread= new Thread(myThread1);
        myThread.start();
        withrunThread.start();

        System.out.println("Thread with main end");
    }
}

class MyThread extends Thread {

    public void run() {
        try {
            sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread with thread");
    }


}

class MyThread1 implements Runnable{


    @Override
    public void run() {
        System.out.println("Thread with runn");

    }
}

