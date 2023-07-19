import java.util.Queue;
import java.util.LinkedList;
public class Main {

    public static void main(String[] args) {

        // queue = FIFO data structure. First-In First-Out (ex. A line of people)
        //         A collection designed for holding elements prior to processing
        //         Linear data structure

        //         add = enqueue, offer()
        //         remove = dequeue, poll()

        // use of queues =
        // 1. Keyboad Buffer (letters should appear on the screen in the order they're pressed)
        // 2. Printer Queue (print jobs should be completed in order)
        // 3. Used in LinkedLists, PriorityQueues, Breadth-first search

        // Instanciate a new LinkedList because a Queue can not be an instance, because
        // the queue data structure is implemented as an Interface.
        // (see the image in this folder) we need to use a LinkedList if we want to use the queue pattern because,
        // this is a Class that implements dequeue and queue
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        // remove the first person in line
        queue.poll();

        // show the first person in line
        System.out.println(queue.peek());

        System.out.println(queue.isEmpty()); // check if queue is empty
        System.out.println(queue.size()); // return the size of the queue
        System.out.println(queue.contains("Harold")); // check if value is inside of queue
    }
}
