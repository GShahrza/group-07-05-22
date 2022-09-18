package main.java.lesson_36;

public class MultiThreadDemoMain4 {
    public static void main(String[] args) throws InterruptedException {
      
        System.out.println("Main thread is starting");
      
        MyThread myThread = new MyThread("child1");
        MyThread myThread2 = new MyThread("child2");
        MyThread myThread3 = new MyThread("child3");
      
        myThread.start();
        Thread.sleep(400L);
        myThread2.start();
        myThread3.start();
      
        try {
            myThread.join();
//            myThread2.join();
//            myThread3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }
      
        System.out.println("Main thread is terminating");
    }
}