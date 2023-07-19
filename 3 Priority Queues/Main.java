import java.util.*;

public class Main {
    public static void main(String args[]) {

        // Priority Queue = A FIFO data structure that serves elements
        //                  with the highest priorities first
        //                  before elements with lower priority

        Queue<Double> defaultQueue = new LinkedList<>();
        Queue<Double> priorityQueue = new PriorityQueue<>();

        defaultQueue.offer(3.0);
        defaultQueue.offer(2.5);
        defaultQueue.offer(4.0);
        defaultQueue.offer(1.5);
        defaultQueue.offer(2.0);

        priorityQueue.offer(3.0);
        priorityQueue.offer(2.5);
        priorityQueue.offer(4.0);
        priorityQueue.offer(1.5);
        priorityQueue.offer(2.0);

        System.out.println("Default Queue polled");
        while(!defaultQueue.isEmpty()) {
            // items are printed in order of their offering
            System.out.println(defaultQueue.poll());
        }
        System.out.println("Priority Queue polled");
        while(!priorityQueue.isEmpty()) {
            // items are printed by priority/in order (here it is the smallest amount)
            System.out.println(priorityQueue.poll());
        }
    }
}
