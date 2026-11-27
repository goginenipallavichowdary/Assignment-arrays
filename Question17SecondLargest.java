import java.util.Arrays;

public class Question17SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {10, 40, 20, 40, 30};

        if (numbers.length < 2) {
            System.out.println("There is no second largest distinct value.");
            return;
        }

        Arrays.sort(numbers);
        int largest = numbers[numbers.length - 1];

        // Scan backward and skip copies of the largest value.
        for (int index = numbers.length - 2; index >= 0; index--) {
            if (numbers[index] < largest) {
                System.out.println("Second largest: " + numbers[index]);
                return;
            }
        }

        System.out.println("There is no second largest distinct value.");
    }
}