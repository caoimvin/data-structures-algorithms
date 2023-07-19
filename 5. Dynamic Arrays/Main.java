import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        // pre-build dynamic Array -> ArrayList data type
        // ArrayList<String> arrayList = new ArrayList<String>();

        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        dynamicArray.insert(0, "X");
        dynamicArray.delete("A");
        System.out.println(dynamicArray.search("C"));

        // System.out.println(dynamicArray.toString());
        System.out.println(dynamicArray);
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println("empty: " + dynamicArray.isEmpty());
    }
}
