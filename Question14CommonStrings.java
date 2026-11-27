import java.util.LinkedHashSet;
import java.util.Set;

public class Question14CommonStrings {
    public static void main(String[] args) {
        String[] first = {"Rama", "Krishna", "Sita"};
        String[] second = {"Sita", "Rama", "Lakshman"};
        Set<String> common = new LinkedHashSet<>();

        for (String firstName : first) {
            for (String secondName : second) {
                if (firstName.equals(secondName)) { // Compare the text.
                    common.add(firstName);
                    break;
                }
            }
        }

        System.out.println("Common strings: " + common);
    }
}