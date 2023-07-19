import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // stack = LIFO data structure. Last-In First-Out
        //         stores objects into a sort of "vertical tower"
        //         push() to add to the top
        //         pop() to remove from the top

        // use of stacks=
        // 1. undo/redo features in text editors
        // 2. moving back/forward through browser
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)

        Stack<String> stack = new Stack<String>();

        // check if stack is empty
        System.out.println(stack.empty());

        // add some items to the stack
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Borderlands");
        stack.push("FFVII");

        System.out.println(stack.empty());

        // remove top-most object from stack (FFVII is now missing from the stack)
        stack.pop();

        // removes Borderlands from stack and saves to variable someGame
        String someGame = stack.pop();
        System.out.println(someGame);

        // see which item lies on the top without removing anything
        System.out.println(stack.peek());

        // search for item in stack
        System.out.println(stack.search("Skyrim")); // gives index of 1 (if not in stack, -1 will be returned)

        // print stack
        System.out.println(stack);
    }
}