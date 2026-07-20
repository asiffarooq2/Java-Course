import java.util.Scanner;

public class PrintDecreasing {

    // Main method
    public static void main(String[] args) {

        // Create Scanner object
        Scanner scn = new Scanner(System.in);

        // Read the number
        System.out.print("Enter a number: ");
        int n = scn.nextInt();

        // Print numbers in decreasing order
        System.out.println("Numbers in decreasing order:");
        printDecreasing(n);

        scn.close();
    }

    // Recursive method to print numbers from n to 1
    public static void printDecreasing(int n) {

        // Base case
        if (n == 0) {
            return;
        }

        // Print the current number
        System.out.println(n);

        // Recursive call
        printDecreasing(n - 1);
    }
}