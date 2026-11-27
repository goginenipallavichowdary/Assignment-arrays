import java.util.LinkedHashSet;
import java.util.Set;

public class Question13DuplicateStrings {
    public static void main(String[] args) {
        String[] names = {"Rama", "Krishna", "Rama", "Sita", "Krishna"};
        Set<String> seen = new LinkedHashSet<>();
        Set<String> duplicates = new LinkedHashSet<>();

        for (String name : names) {
            // If the name was already seen, record it as a duplicate.
            if (!seen.add(name)) {
                duplicates.add(name);
            }
        }

        System.out.println("Duplicates: " + duplicates);
    }
}