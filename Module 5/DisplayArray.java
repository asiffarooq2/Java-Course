import java.util.Scanner;

public class DisplayArray {

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

        // Display the array recursively
        System.out.println("\nArray Elements:");
        displayArr(arr, 0);

        scn.close();
    }

    // Recursive method to display array elements
    public static void displayArr(int[] arr, int idx) {

        // Base case
        if (idx == arr.length) {
            return;
        }

        // Print current element
        System.out.println(arr[idx]);

        // Recursive call for the next element
        displayArr(arr, idx + 1);
    }
}