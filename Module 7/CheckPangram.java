import java.util.Scanner;

public class CheckPangram {

    // Method to check whether a string is a pangram
    public static boolean isPangram(String str) {

        // Convert the string to lowercase
        str = str.toLowerCase();

        // Boolean array to mark the presence of letters
        boolean[] letters = new boolean[26];

        // Traverse the string
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Check if the character is a letter
            if (ch >= 'a' && ch <= 'z') {
                letters[ch - 'a'] = true;
            }
        }

        // Verify that every letter is present
        for (int i = 0; i < 26; i++) {
            if (!letters[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Read the input sentence
        System.out.print("Enter a sentence: ");
        String input = scn.nextLine();

        // Check whether it is a pangram
        if (isPangram(input)) {
            System.out.println("\"" + input + "\" is a Pangram.");
        } else {
            System.out.println("\"" + input + "\" is Not a Pangram.");
        }

        scn.close();
    }
}