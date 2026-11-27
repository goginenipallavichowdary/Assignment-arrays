import java.util.LinkedHashSet;
import java.util.Set;

public class Question15CommonIntegers {
    public static void main(String[] args) {
        int[] first = {10, 20, 30, 40};
        int[] second = {30, 50, 10};
        Set<Integer> common = new LinkedHashSet<>();

        for (int firstNumber : first) {
            for (int secondNumber : second) {
                if (firstNumber == secondNumber) {
                    common.add(firstNumber);
                    break; // This number is a match. Move to the next one.
                }
            }
        }

        System.out.println("Common integers: " + common);
    }
}