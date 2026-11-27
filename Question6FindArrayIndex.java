public class Question6FindArrayIndex {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        int target = 30;
        int foundIndex = -1; // -1 means no match was found.

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == target) {
                foundIndex = index;
                break; // Keep the index of the first match.
            }
        }

        System.out.println("Index: " + foundIndex);
    }
}