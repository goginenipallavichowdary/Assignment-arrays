import java.util.Arrays;

public class Question8CopyArray {
    public static void main(String[] args) {
        int[] original = {10, 20, 30};
        int[] copy = new int[original.length];

        // Copy each value to the same index in the new array.
        for (int index = 0; index < original.length; index++) {
            copy[index] = original[index];
        }

        System.out.println("Copy: " + Arrays.toString(copy));
    }
}