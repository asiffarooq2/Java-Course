import java.util.Scanner;

public class QuickSort {

    // Method to swap two elements
    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Method to partition the array
    public static int partition(int[] arr, int low, int high) {

        // Choose the last element as the pivot
        int pivot = arr[high];

        // Index of smaller element
        int i = low - 1;

        // Rearrange elements based on the pivot
        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Place the pivot in its correct position
        swap(arr, i + 1, high);

        return i + 1;
    }

    // Method to perform Quick Sort
    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            // Partition the array
            int pivotIndex = partition(arr, low, high);

            // Sort the left subarray
            quickSort(arr, low, pivotIndex - 1);

            // Sort the right subarray
            quickSort(arr, pivotIndex + 1, high);
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

        // Read array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Perform Quick Sort
        quickSort(arr, 0, n - 1);

        // Display the sorted array
        System.out.println("\nSorted Array:");
        printArray(arr);

        scn.close();
    }
}