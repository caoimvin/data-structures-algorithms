public class Main {
    public static void main(String[] args) {

        /*
        recursion = when a thing is defined in terms of itself - Wikipedia
                    Apply the result of a procedure to a procedure.
                    A recursive method calls itself. Can be a substitute for iteration.
                    Divide a problem into sub-problems of the same type as the original.
                    Commonly used with advanced sorting algorithms and navigating trees

                    Advantages
                    ----------
                    easier to read/write
                    easier to debug

                    Disadvantages
                    ----------
                    sometimes slower
                    uses more memory -> due to Call Stack -> more methods need to be tracked
         */

        // recursion = repetition of procedure
        // iteration = repetition of process

        walkIteration(5);
        walkRecursive(5);

        System.out.println("factorial of 7 is: " + factorial(7));
        System.out.println("2 to the power of 8 is: " + power(2, 8));
    }

    private static int power(int base, int exponent) {
        if (exponent < 1) return 1; // base case
        return base * power(base, exponent - 1); // recursive case
    }
    private static int factorial(int num) {

        if (num < 1) return 1; // base case
        return num * factorial(num - 1); // recursive
    }

    private static void walkIteration(int steps) {

        for (int i = 0; i < steps; i++) {
            System.out.println("You take a step");
        }
    }

    private static void walkRecursive(int steps) {

        if (steps < 1) return;
        System.out.println("You take a step");
        walkRecursive(steps - 1);
    }
}