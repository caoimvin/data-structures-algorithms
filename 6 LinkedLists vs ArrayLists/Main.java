import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for(int i = 0; i < 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }

        // ********** LinkedList ********************
        startTime = System.nanoTime();

        //linkedList.get(0); -> gets first element slower
        //linkedList.get(500000); -> gets middle element way slower
        //linkedList.get(999999); ->gets last element slower

        //linkedList.remove(0); -> removes first item faster
        //linkedList.remove(500000); -> remove middle item slower
        //linkedList.remove(999999); -> removes last element slower

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList:\t" + elapsedTime + " ns");

        // ********** ArrayList *********************
        startTime = System.nanoTime();

        //arrayList.get(0); -> gets first element faster
        //linkedList.get(500000); -> gets middle element faster
        //linkedList.get(999999); -> gets middle element faster

        //arrayList.remove(0); -> removes first item slower (all elements need to be shift to the left)
        //linkedList.remove(500000); -> removes item in middle faster (less items to shift than with the first element)
        //arrayList.remove(999999); -> remove of last element ist faster

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList:\t" + elapsedTime + " ns");


        //############################
        // in most situations an arrayList is better than a LinkedList but if you have a large dataset and many
        // insertions and deletes a LinkedList might be better
        //############################
    }
}
