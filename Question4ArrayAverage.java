public class Question4ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20};

        if (numbers.length == 0) {
            System.out.println("The array is empty.");
            return;
        }

        long sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Convert to double so division keeps the decimal part.
        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);
    }
}