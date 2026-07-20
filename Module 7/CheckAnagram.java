import java.util.Scanner;
import java.util.Arrays;

public class CheckAnagram {

    // Method to check whether two strings are anagrams
    public static boolean areAnagram(char[] str1, char[] str2) {

        // Check if lengths are equal
        if (str1.length != str2.length) {
            return false;
        }

        // Sort both character arrays
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Compare the sorted arrays
        for (int i = 0; i < str1.length; i++) {
            if (str1[i] != str2[i]) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Read first string
        System.out.print("Enter the first string: ");
        String input1 = scn.nextLine();

        // Read second string
        System.out.print("Enter the second string: ");
        String input2 = scn.nextLine();

        // Convert strings to character arrays
        char[] str1 = input1.toCharArray();
        char[] str2 = input2.toCharArray();

        // Check for anagram
        if (areAnagram(str1, str2)) {
            System.out.println("\"" + input1 + "\" and \"" + input2 + "\" are Anagrams.");
        } else {
            System.out.println("\"" + input1 + "\" and \"" + input2 + "\" are Not Anagrams.");
        }

        scn.close();
    }
}
