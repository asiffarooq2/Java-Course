import java.util.Scanner;

public class KMPStringMatching {

    // Method to perform KMP Search
    public static void KMPSearch(String pattern, String text) {

        int m = pattern.length();
        int n = text.length();

        // Array to store the Longest Prefix Suffix values
        int[] lps = new int[m];

        // Compute the LPS array
        computeLPSArray(pattern, lps);

        int i = 0; // Index for text
        int j = 0; // Index for pattern

        while (i < n) {

            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }

            // Pattern found
            if (j == m) {
                System.out.println("Pattern found at index " + (i - j));
                j = lps[j - 1];
            }

            // Mismatch after j matches
            else if (i < n && pattern.charAt(j) != text.charAt(i)) {

                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
    }

    // Method to compute the LPS array
    public static void computeLPSArray(String pattern, int[] lps) {

        int length = 0;
        lps[0] = 0;

        int i = 1;

        while (i < pattern.length()) {

            if (pattern.charAt(i) == pattern.charAt(length)) {

                length++;
                lps[i] = length;
                i++;

            } else {

                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the text
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Read the pattern
        System.out.print("Enter the pattern: ");
        String pattern = sc.nextLine();

        // Perform KMP Search
        KMPSearch(pattern, text);

        sc.close();
    }
}