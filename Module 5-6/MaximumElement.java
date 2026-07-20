import java.util.Scanner;

public class MaximumElement {

    // Main method
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the number of elements: ");
        int n = scn.nextInt();

        // Create the array
        int[] arr = new int[n];

        // Read array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Find maximum using iterative method
        int iterativeMax = findMaxIterative(arr);

        // Find maximum using recursive method
        int recursiveMax = findMaxRecursive(arr, 0);

        // Display results
        System.out.println("\nMaximum Element (Iterative): " + iterativeMax);
        System.out.println("Maximum Element (Recursive): " + recursiveMax);

        scn.close();
    }

    // Iterative method to find the maximum element
    public static int findMaxIterative(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    // Recursive method to find the maximum element
    public static int findMaxRecursive(int[] arr, int idx) {

        // Base case
        if (idx == arr.length - 1) {
            return arr[idx];
        }

        // Recursive call
        int maxInRemaining = findMaxRecursive(arr, idx + 1);

        // Return the larger value
        return Math.max(arr[idx], maxInRemaining);
    }
}