package main.java.lesson_36;

public class ThreadPart2 {

    public static void main(String[] args) {

        System.out.println("Main thread is starting");

        MyThread myThread = new MyThread("child1");
        MyThread myThread2 = new MyThread("child2");
        MyThread myThread3 = new MyThread("child3");

        myThread.start();
        myThread2.start();
        myThread3.start();

        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread is interrupted");
            }
        } while (myThread.isAlive() || myThread2.isAlive() || myThread3.isAlive());

        System.out.println("Main thread is terminating");
    }

}

 class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " is starting.");

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(400);
                System.out.println("In " + getName() + " count is " + i);
            } catch (InterruptedException e) {
                System.out.println(getName() + " is interrupted");
            }
        }

        System.out.println(getName() + " is terminating");
    }
}
