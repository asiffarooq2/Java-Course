import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class EmailCharacterFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the email ID
        System.out.print("Enter an Email ID: ");
        String email = sc.nextLine();

        // Store frequencies while maintaining insertion order
        LinkedHashMap<Character, Integer> frequency = new LinkedHashMap<>();

        // Traverse the email ID
        for (int i = 0; i < email.length(); i++) {

            char ch = email.charAt(i);

            // Check for numeric or special character
            if (Character.isDigit(ch) || !Character.isLetter(ch)) {

                if (frequency.containsKey(ch)) {
                    frequency.put(ch, frequency.get(ch) + 1);
                } else {
                    frequency.put(ch, 1);
                }
            }
        }

        // Display the result
        System.out.println("\nFrequency of Numeric and Special Characters:");

        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

        sc.close();
    }
}