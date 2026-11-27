import java.util.Arrays;

public class Question1SortArrays {
    public static void main(String[] args) {
        int[] numbers = {23, 3, 5, 2, 4};
        String[] names = {"Rama", "Krishna"};

        // sort changes the order of the elements in the original array.
        Arrays.sort(numbers);
        Arrays.sort(names);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));
    }
}