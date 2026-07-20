import java.util.Scanner;

public class ArrayReverse {

    // Main method
    public static void main(String[] args) {

        // Create Scanner object
        Scanner scn = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scn.nextInt();

        // Create the array
        int[] arr = new int[n];

        // Read array elements
        System.out.println("Enter the " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Display the array in reverse order
        System.out.println("\nArray Elements in Reverse Order:");
        displayArrReverse(arr, 0);

        scn.close();
    }

    // Recursive method to display array elements in reverse order
    public static void displayArrReverse(int[] arr, int idx) {

        // Base case
        if (idx == arr.length) {
            return;
        }

        // Recursive call
        displayArrReverse(arr, idx + 1);

        // Print current element after recursive call
        System.out.println(arr[idx]);
    }
}