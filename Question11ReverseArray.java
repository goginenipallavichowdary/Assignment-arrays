import java.util.Arrays;

public class Question11ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int left = 0;
        int right = numbers.length - 1;

        // Swap opposite ends, then move both indexes toward the middle.
        while (left < right) {
            int temporary = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temporary;

            left++;
            right--;
        }

        System.out.println(Arrays.toString(numbers));
    }
}