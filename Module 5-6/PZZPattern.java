import java.util.Scanner;

public class PZZPattern {

    // Main method
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Read the value of n
        System.out.print("Enter a positive number: ");
        int n = scn.nextInt();

        // Print the PZZ pattern
        System.out.println("PZZ Pattern:");
        pzz(n);

        scn.close();
    }

    // Recursive method to print the PZZ pattern
    public static void pzz(int n) {

        // Base case
        if (n == 0) {
            return;
        }

        // Pre
        System.out.print(n + " ");

        pzz(n - 1);

        // In
        System.out.print(n + " ");

        pzz(n - 1);

        // Post
        System.out.print(n + " ");
    }
}