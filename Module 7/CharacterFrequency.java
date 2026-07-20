import java.util.ArrayList;
import java.util.Scanner;

public class CharacterFrequency {

    // Method to calculate the frequency of characters
    public static void frequency(String str) {

        if (str.length() == 0) {
            System.out.println("Empty String");
            return;
        }

        ArrayList<CharOccur> occurrences = new ArrayList<>();

        // Count the frequency of each character
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            boolean found = false;

            for (CharOccur obj : occurrences) {

                if (obj.character == ch) {
                    obj.occurrence++;
                    found = true;
                    break;
                }
            }

            if (!found) {
                occurrences.add(new CharOccur(ch, 1));
            }
        }

        // Display the frequencies
        System.out.println("Character\tFrequency");

        for (CharOccur obj : occurrences) {
            System.out.println(obj.character + "\t\t" + obj.occurrence);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read first string
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.println("\nFrequency of characters in \"" + str1 + "\"");
        frequency(str1);

        // Read second string
        System.out.print("\nEnter the second string: ");
        String str2 = sc.nextLine();

        System.out.println("\nFrequency of characters in \"" + str2 + "\"");
        frequency(str2);

        sc.close();
    }
}

// Class to store a character and its frequency
class CharOccur {

    char character;
    int occurrence;

    public CharOccur(char character, int occurrence) {
        this.character = character;
        this.occurrence = occurrence;
    }
}