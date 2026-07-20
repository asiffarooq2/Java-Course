import java.util.Scanner;

public class LongestPalindrome {

    // Method to find the longest palindromic substring
    public static String longestPalindrome(String str) {

        int n = str.length();

        // Handle empty string
        if (n == 0) {
            return "";
        }

        boolean[][] isPalindrome = new boolean[n][n];

        int start = 0;
        int maxLength = 1;

        // Every single character is a palindrome
        for (int i = 0; i < n; i++) {
            isPalindrome[i][i] = true;
        }

        // Check for two-character palindromes
        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                isPalindrome[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        // Check for substrings of length 3 or more
        for (int length = 3; length <= n; length++) {

            for (int i = 0; i <= n - length; i++) {

                int j = i + length - 1;

                if (str.charAt(i) == str.charAt(j) && isPalindrome[i + 1][j - 1]) {

                    isPalindrome[i][j] = true;

                    if (length > maxLength) {
                        start = i;
                        maxLength = length;
                    }
                }
            }
        }

        return str.substring(start, start + maxLength);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = longestPalindrome(str);

        System.out.println("Longest Palindromic Substring: " + result);

        sc.close();
    }
}
