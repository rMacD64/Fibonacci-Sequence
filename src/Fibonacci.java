import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        int num = 8;
        ArrayList<Integer> sequence = new ArrayList<Integer>();

        for (int index = 1; index <= num; index++) {
            sequence.add(FibSeq(index, sequence));
        }

        for (int index = 0; index < num; index++) {
            System.out.print(sequence.get(index));
            if (index < (num - 1)) {
                System.out.print(", ");
            }
        }
    }

    private static int FibSeq(int i, ArrayList<Integer> numList) {
        int num = 1;

        if (i >= 3) {
            num = FibSeq(i - 1, numList) + FibSeq(i - 2, numList);
        }

        return num;
    }
}
