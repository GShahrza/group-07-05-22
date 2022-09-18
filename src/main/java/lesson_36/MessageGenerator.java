package main.java.lesson_36;

public class MessageGenerator {
  
    String state;
  
    synchronized void tick(boolean running) {
        if (!running) {
            state = "ticked";
            notify();
            return;
        }
      
        System.out.print("Tick ");
        state = "ticked";
        notify();
      
        try {
            while (!state.equals("tocked")) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
  
    synchronized void tock(boolean running) {
        if (!running) {
            state = "tocked";
            notify();
            return;
        }
      
        System.out.println("tock");
        state = "tocked";
        notify();
      
        try {
            while (!state.equals("ticked")) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Main2 {
    public static void main(String[] args) {

        MessageGenerator generator = new MessageGenerator();

        ThreadMy thread1 = new ThreadMy("Tick", generator);
        ThreadMy thread2 = new ThreadMy("Tock", generator);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }
        System.out.println("Main thread is finishing");
    }
}
 class ThreadMy extends Thread {
    MessageGenerator generator;

    public ThreadMy(String name, MessageGenerator generator) {
        super(name);
        this.generator = generator;
    }

    public void run() {

        System.out.println(this.getName() + " is starting");

        if(this.getName().equals("Tick")) {
            for (int i = 0; i < 5; i++) {
                generator.tick(true);
            }
            generator.tick(false);
        }  else {
            for (int i = 0; i < 5; i++) {
                generator.tock(true);
            }
            generator.tock(false);
        }

        System.out.println(this.getName() + " is finishing");
    }
}