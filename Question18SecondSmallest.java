import java.util.Arrays;

public class Question18SecondSmallest {
    public static void main(String[] args) {
        int[] numbers = {30, 10, 20, 10, 40};

        if (numbers.length < 2) {
            System.out.println("There is no second smallest distinct value.");
            return;
        }

        Arrays.sort(numbers);
        int smallest = numbers[0];

        // The first value greater than the smallest is the answer.
        for (int index = 1; index < numbers.length; index++) {
            if (numbers[index] > smallest) {
                System.out.println("Second smallest: " + numbers[index]);
                return;
            }
        }

        System.out.println("There is no second smallest distinct value.");
    }
}