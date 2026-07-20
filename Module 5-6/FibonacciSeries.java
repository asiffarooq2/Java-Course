import java.util.Scanner;

public class FibonacciSeries {

    // Static variables to store Fibonacci numbers
    static int first = 0;
    static int second = 1;
    static int next;

    // Recursive method to print the Fibonacci series
    public static void printFibonacci(int count) {

        if (count > 0) {

            next = first + second;

            first = second;
            second = next;

            System.out.print(" " + next);

            printFibonacci(count - 1);
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Read the number of terms
        System.out.print("Enter the number of Fibonacci numbers to print: ");
        int count = scn.nextInt();

        if (count <= 0) {
            System.out.println("Please enter a positive number.");
        } else if (count == 1) {
            System.out.println(first);
        } else {
            // Print the first two Fibonacci numbers
            System.out.print("Fibonacci Series: ");
            System.out.print(first + " " + second);

            // Print the remaining numbers recursively
            printFibonacci(count - 2);
        }

        scn.close();
    }
}
