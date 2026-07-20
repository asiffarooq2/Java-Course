import java.util.Scanner;

public class PowerLogarithmic {

    // Main method
    public static void main(String[] args) {

        // Create Scanner object
        Scanner scn = new Scanner(System.in);

        // Read the base
        System.out.print("Enter the base (x): ");
        int x = scn.nextInt();

        // Read the exponent
        System.out.print("Enter the exponent (n): ");
        int n = scn.nextInt();

        // Calculate x^n
        int result = power(x, n);

        // Display the result
        System.out.println("Result: " + result);

        scn.close();
    }

    // Recursive method to calculate x^n in O(log n) time
    public static int power(int x, int n) {

        // Base case
        if (n == 0) {
            return 1;
        }

        // Recursive call
        int halfPower = power(x, n / 2);

        // Square the half power
        int result = halfPower * halfPower;

        // If exponent is odd, multiply by x
        if (n % 2 != 0) {
            result *= x;
        }

        return result;
    }
}