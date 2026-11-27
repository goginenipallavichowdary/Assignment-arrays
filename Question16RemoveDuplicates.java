import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Question16RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 20};

        // A LinkedHashSet keeps the first occurrence of each value in order.
        Set<Integer> unique = new LinkedHashSet<>();
        for (int number : numbers) {
            unique.add(number);
        }

        // Copy the unique values back into a regular int array.
        int[] result = new int[unique.size()];
        int index = 0;

        for (int number : unique) {
            result[index] = number;
            index++;
        }

        System.out.println(Arrays.toString(result));
    }
}