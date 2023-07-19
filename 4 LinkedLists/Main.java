import java.util.*;

public class Main {
    public static void main(String args[]) {

        /*
        LinkedList = stores Nodes in 2 parts (data + address)
                     Nodes are in non-consecutive memory locations
                     Elements are linked using pointers

                                    Singly Linked List
                        Node               Node                    Node
                     [data | address] -> [data | address] -> [data | address]

                                    Doubly Linked List
                                Node                        Node
                     [address | data | address] <-> [address | data | address]

                     advantages?
                     1. Dynamic Data Structure (allocates needed memory while running)
                     2. Insertion and Deletion of Nodes is easy. O(1)
                     3. No/Low memory waste

                     disadvantages?
                     1. Greater memory usage (additional pointer)
                     2. No random access of elements (no index [i])
                     3. Accessing/searching elements is more time-consuming. O(n)

                     uses?
                     1. implement Stack/Queues
                     2. GPS navigation
                     3. music playlist
         */

        LinkedList<String> linkedList = new LinkedList<String>();

        /*
        We can treat a LinkedList like a stack
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.pop(); -> remove the list item
         */

        /*
        We can also treat it as a queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.poll(); -> remove the first item

        linkedList.add(3, "E"); -> add item by index
        linkedList.remove("E");

        linkedList.peekFirst(); -> show first item
        linkedList.peekLast(); -> show last item
        linkedList.addFirst("0");
        linkedList.addLast("G");
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();
         */
    }
}
