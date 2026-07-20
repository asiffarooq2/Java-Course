import java.util.Scanner;

public class CompareStrings {

    // Method to compare two strings lexicographically
    public static int compareStrings(String str1, String str2) {

        int minLength = Math.min(str1.length(), str2.length());

        // Compare characters one by one
        for (int i = 0; i < minLength; i++) {

            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.charAt(i) - str2.charAt(i);
            }
        }

        // If all compared characters are equal,
        // compare the lengths of the strings
        return str1.length() - str2.length();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the first string
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        // Read the second string
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        // Compare the strings
        int result = compareStrings(str1, str2);

        // Display the result
        if (result == 0) {
            System.out.println("\nThe strings are equal.");
        } else if (result < 0) {
            System.out.println("\nThe first string is lexicographically smaller than the second string.");
        } else {
            System.out.println("\nThe first string is lexicographically larger than the second string.");
        }

        sc.close();
    }
}