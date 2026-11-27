public class Question10ArrayMaxMin {
    public static void main(String[] args) {
        int[] numbers = {23, 3, 5, 2, 4};

        if (numbers.length == 0) {
            System.out.println("The array is empty.");
            return;
        }

        // Start with the first value so this also works for negative numbers.
        int maximum = numbers[0];
        int minimum = numbers[0];

        for (int index = 1; index < numbers.length; index++) {
            if (numbers[index] > maximum) {
                maximum = numbers[index];
            }
            if (numbers[index] < minimum) {
                minimum = numbers[index];
            }
        }

        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
    }
}