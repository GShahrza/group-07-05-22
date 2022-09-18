package main.java.lesson_36;

public class Salam extends Thread {
  
    private int count = 0;
    public static boolean counting = true;
    private static final int maxCount = 100_000_000;
  
    public void run() {
        System.out.println(this.getName() + " is starting.");
        
        do {
            this.count++;
            if(this.count == maxCount) {
                counting = false;
            }
        } while (counting && this.count < maxCount);
        
        System.out.println("In " + this.getName() + " count : " + count);
    }
}
class Main {
    public static void main(String[] args) {

        System.out.println("Number of processors : " + Runtime.getRuntime().availableProcessors());

        Salam[] threads = new Salam[30];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Salam();
        }

        threads[0].setPriority(Thread.MAX_PRIORITY);
//        threads[1].setPriority(Thread.MAX_PRIORITY);
//        threads[2].setPriority(Thread.MAX_PRIORITY);
//        threads[3].setPriority(Thread.MAX_PRIORITY);
//        threads[4].setPriority(Thread.MIN_PRIORITY);
//        threads[5].setPriority(Thread.MIN_PRIORITY);
//        threads[6].setPriority(Thread.MIN_PRIORITY);

        for (Salam thead : threads) {
            thead.start();
        }

        try {
            for (Salam thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}