import java.util.Arrays;

public class Question9InsertArrayElement {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 40, 50};
        int insertIndex = 2;
        int value = 30;

        if (insertIndex < 0 || insertIndex > numbers.length) {
            System.out.println("Invalid index.");
            return;
        }

        int[] result = new int[numbers.length + 1];

        // Copy the values before the insertion point.
        for (int index = 0; index < insertIndex; index++) {
            result[index] = numbers[index];
        }

        result[insertIndex] = value;

        // Shift the remaining values one place to the right.
        for (int index = insertIndex; index < numbers.length; index++) {
            result[index + 1] = numbers[index];
        }

        System.out.println(Arrays.toString(result));
    }
}