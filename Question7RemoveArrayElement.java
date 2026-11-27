import java.util.Arrays;

public class Question7RemoveArrayElement {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 20, 40};
        int target = 20;
        int removeIndex = -1;

        // Find the first occurrence of the value.
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == target) {
                removeIndex = index;
                break;
            }
        }

        if (removeIndex == -1) {
            System.out.println("Value not found.");
            return;
        }

        // Arrays have a fixed length, so create a smaller array.
        int[] result = new int[numbers.length - 1];
        int next = 0;

        for (int index = 0; index < numbers.length; index++) {
            if (index != removeIndex) {
                result[next] = numbers[index];
                next++;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}