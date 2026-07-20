import java.util.Scanner;

public class SelectionSort {

    // Method to perform Selection Sort
    public static void sort(int[] arr) {

        int n = arr.length;

        // Traverse the array
        for (int i = 0; i < n - 1; i++) {

            // Assume the first element is the minimum
            int minIndex = i;

            // Find the smallest element in the remaining array
            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the current element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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