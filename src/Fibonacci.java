import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        int num = 8;    // num is the number of indices in the Fibonacci Sequence.

        for (int index = 1; index <= num; index++) {    // Labelled indices starting at 1 for better readability.
            System.out.print(FibSeq(index));    // Calling the FibSeq method and printing numbers on the same line.
            if (index < num) {  // Prints a comma and space after numbers in the Fibonacci Sequence, but never after the last number.
                System.out.print(", ");
            }
        }
    }

    private static int FibSeq(int i) {
        int result = 1;

        // If it is not the first two indices in the list, it adds the values of the two previous indices. Otherwise, it returns 1.
        if (i >= 3) {
            result = FibSeq(i - 1) + FibSeq(i - 2);
        }

        return result;
    }
}
