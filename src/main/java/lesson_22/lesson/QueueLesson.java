package main.java.lesson_22.lesson;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLesson {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        System.out.println(queue.offer(10)); // true
        System.out.println(queue.offer(4)); // true
        System.out.println(queue.peek()); // 10
        System.out.println(queue.poll()); // 10
        System.out.println(queue.poll()); // 4
        System.out.println(queue.peek().toString()); // null
    }
}
