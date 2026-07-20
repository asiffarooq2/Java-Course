import java.util.Scanner;

public class InsertionSort {

    // Method to perform Insertion Sort
    public static void sort(int[] arr) {

        int n = arr.length;

        // Traverse from the second element to the last
        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            // Shift elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the key at its correct position
            arr[j + 1] = key;
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {

        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Read the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scn.nextInt();

        // Create the array
        int[] arr = new int[n];

        // Read the array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Sort the array
        sort(arr);

        // Display the sorted array
        System.out.println("\nSorted Array:");
        printArray(arr);

        scn.close();
    }
}
