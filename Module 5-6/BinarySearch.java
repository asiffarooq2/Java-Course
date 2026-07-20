import java.util.Scanner;

public class BinarySearch {

    // Method to perform Binary Search
    public static int binarySearch(int[] arr, int x) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Element found
            if (arr[mid] == x) {
                return mid;
            }

            // Search in the right half
            if (arr[mid] < x) {
                left = mid + 1;
            }

            // Search in the left half
            else {
                right = mid - 1;
            }
        }

        // Element not found
        return -1;
    }

    // Main method
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Read the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scn.nextInt();

        // Create the array
        int[] arr = new int[n];

        // Read the array elements
        System.out.println("Enter the elements of the array (sorted in ascending order):");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Read the element to search
        System.out.print("Enter the element to search: ");
        int x = scn.nextInt();

        // Perform Binary Search
        int index = binarySearch(arr, x);

        // Display the result
        if (index == -1) {
            System.out.println("Element is not present in the array.");
        } else {
            System.out.println("Element is present at index " + index + ".");
        }

        scn.close();
    }
}
