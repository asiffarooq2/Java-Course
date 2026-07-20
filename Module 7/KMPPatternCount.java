import java.util.Scanner;

public class KMPPatternCount {

    // Compute the LPS (Longest Prefix Suffix) array
    public static void computeLPS(String pattern, int[] lps) {

        int len = 0;
        int i = 1;

        lps[0] = 0;

        while (i < pattern.length()) {

            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {

                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    // Count occurrences of pattern in text
    public static int countOccurrences(String pattern, String text) {

        int m = pattern.length();
        int n = text.length();

        int[] lps = new int[m];
        computeLPS(pattern, lps);

        int i = 0;
        int j = 0;
        int count = 0;

        while (i < n) {

            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }

            if (j == m) {
                count++;
                j = lps[j - 1];
            } else if (i < n && pattern.charAt(j) != text.charAt(i)) {

                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Pattern (P): ");
        String pattern = sc.nextLine();

        System.out.print("Enter Text (T): ");
        String text = sc.nextLine();

        int result = countOccurrences(pattern, text);

        System.out.println("Number of occurrences: " + result);

        sc.close();
    }
}