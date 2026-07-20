import java.util.Scanner;

public class ReplaceSubstring {

    // Method to replace all occurrences of oldSub with newSub
    public static String replaceSubstring(String str, String oldSub, String newSub) {

        // Check for invalid input
        if (str == null || oldSub == null || newSub == null || oldSub.length() == 0) {
            return str;
        }

        StringBuilder result = new StringBuilder();

        int startIndex = 0;
        int foundIndex;

        // Find and replace every occurrence
        while ((foundIndex = str.indexOf(oldSub, startIndex)) != -1) {

            // Append the part before the matched substring
            result.append(str.substring(startIndex, foundIndex));

            // Append the replacement substring
            result.append(newSub);

            // Move to the next part of the string
            startIndex = foundIndex + oldSub.length();
        }

        // Append the remaining part of the string
        result.append(str.substring(startIndex));

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the main string
        System.out.print("Enter the main string: ");
        String str = sc.nextLine();

        // Read the substring to replace
        System.out.print("Enter the substring to replace: ");
        String oldSub = sc.nextLine();

        // Read the new substring
        System.out.print("Enter the new substring: ");
        String newSub = sc.nextLine();

        // Replace the substring
        String modified = replaceSubstring(str, oldSub, newSub);

        // Display the result
        System.out.println("\nModified String: " + modified);

        sc.close();
    }
}