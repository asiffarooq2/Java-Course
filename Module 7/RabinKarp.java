import java.util.Scanner;

public class RabinKarp {

    // Base used for hash calculation
    public static final int d = 10;

    // Method to search the pattern in the text
    public static void search(String pattern, String text, int q) {

        int m = pattern.length();
        int n = text.length();

        int p = 0; // Hash value of pattern
        int t = 0; // Hash value of current text window
        int h = 1;

        // Calculate h = (d^(m-1)) % q
        for (int i = 0; i < m - 1; i++) {
            h = (h * d) % q;
        }

        // Calculate the hash value of the pattern
        // and the first window of the text
        for (int i = 0; i < m; i++) {
            p = (d * p + pattern.charAt(i)) % q;
            t = (d * t + text.charAt(i)) % q;
        }

        // Slide the pattern over the text
        for (int i = 0; i <= n - m; i++) {

            // If hash values match, compare characters
            if (p == t) {

                int j;

                for (j = 0; j < m; j++) {

                    if (text.charAt(i + j) != pattern.charAt(j))
                        break;
                }

                if (j == m) {
                    System.out.println("Pattern found at position " + (i + 1));
                }
            }

            // Calculate hash value for the next window
            if (i < n - m) {

                t = (d * (t - text.charAt(i) * h)
                        + text.charAt(i + m)) % q;

                if (t < 0)
                    t = t + q;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        System.out.print("Enter the pattern: ");
        String pattern = sc.nextLine();

        System.out.print("Enter a prime number (e.g., 13): ");
        int q = sc.nextInt();

        search(pattern, text, q);

        sc.close();
    }
}