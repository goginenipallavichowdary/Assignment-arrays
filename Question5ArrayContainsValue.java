public class Question5ArrayContainsValue {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        int target = 30;
        boolean found = false;

        for (int number : numbers) {
            if (number == target) {
                found = true;
                break; // Stop at the first match.
            }
        }

        System.out.println("Contains " + target + ": " + found);
    }
}