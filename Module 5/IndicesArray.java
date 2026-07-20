import java.util.Scanner;

public class IndicesArray {

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
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Read the element to search
        System.out.print("Enter the number to find indices: ");
        int x = scn.nextInt();

        // Display all indices
        System.out.println("Indices of " + x + " are:");
        allIndexes(arr, n, x);

        scn.close();
    }

    // Recursive method to find all indices
    public static int allIndexesRecursive(int[] input, int size, int x, int[] output) {

        // Base case
        if (size == 0) {
            return 0;
        }

        // Recursive call
        int count = allIndexesRecursive(input, size - 1, x, output);

        // Store the index if the element is found
        if (input[size - 1] == x) {
            output[count] = size - 1;
            count++;
        }

        return count;
    }

    // Method to print all indices
    public static void allIndexes(int[] input, int n, int x) {

        int[] output = new int[n];

        int count = allIndexesRecursive(input, n, x, output);

        if (count == 0) {
            System.out.println("Element not found.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.print(output[i] + " ");
            }
            System.out.println();
        }
    }
}
