import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestUniqueSubstring {

    // Method to find the longest unique substring
    public static String longestUniqueSubstring(String str) {

        Set<Character> seen = new HashSet<>();

        int start = 0;
        String longest = "";

        // Traverse the string
        for (int end = 0; end < str.length(); end++) {

            // Remove repeated characters from the beginning
            while (seen.contains(str.charAt(end))) {
                seen.remove(str.charAt(start));
                start++;
            }

            // Add the current character
            seen.add(str.charAt(end));

            // Update the longest substring
            if (end - start + 1 > longest.length()) {
                longest = str.substring(start, end + 1);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Find the longest unique substring
        String result = longestUniqueSubstring(str);

        // Display the result
        System.out.println("Longest Unique Substring: " + result);
        System.out.println("Length: " + result.length());

        sc.close();
    }
}