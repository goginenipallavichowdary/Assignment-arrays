import java.util.Arrays;

public class Question20CompareArrays {
    public static void main(String[] args) {
        int[] first = {10, 20, 30};
        int[] second = {10, 20, 30};

        // The arrays must have the same length and values in the same order.
        boolean equal = Arrays.equals(first, second);

        System.out.println("Arrays are equal: " + equal);
    }
}