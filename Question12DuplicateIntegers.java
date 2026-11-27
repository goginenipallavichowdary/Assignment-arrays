import java.util.LinkedHashSet;
import java.util.Set;

public class Question12DuplicateIntegers {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 20, 10};
        Set<Integer> seen = new LinkedHashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();

        for (int number : numbers) {
            // add returns false if the value is already in the set.
            if (!seen.add(number)) {
                duplicates.add(number);
            }
        }

        System.out.println("Duplicates: " + duplicates);
    }
}