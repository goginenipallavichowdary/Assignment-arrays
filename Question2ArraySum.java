public class Question2ArraySum {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        long sum = 0;

        // Read each value and add it to the running total.
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum: " + sum);
    }
}