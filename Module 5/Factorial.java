import java.util.Scanner;

public class Factorial {

    // Main method
    public static void main(String[] args) {

        // Create Scanner object
        Scanner scn = new Scanner(System.in);

        // Read the number
        System.out.print("Enter a number to calculate its factorial: ");
        int n = scn.nextInt();

        // Calculate and display the factorial
        System.out.println("Factorial of " + n + " is: " + factorial(n));

        scn.close();
    }

    // Recursive method to calculate factorial
    public static int factorial(int n) {

        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive case
        return n * factorial(n - 1);
    }
}
