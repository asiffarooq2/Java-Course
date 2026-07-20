import java.util.Scanner;

public class FindElementArray {

    // Main method
    public static void main(String[] args) {

        // Create Scanner object
        Scanner scn = new Scanner(System.in);

        // Read the element to search
        System.out.print("Enter the element to search for: ");
        int d = scn.nextInt();

        // Read the array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scn.nextInt();

        // Create the array
        int[] arr = new int[n];

        // Read array elements
        System.out.println("Enter the " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Find the index of the element
        int index = find(arr, d);

        // Display the result
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }

        // Close the scanner
        scn.close();
    }

    // Method to find an element in the array
    public static int find(int[] arr, int d) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == d) {
                return i;
            }
        }

        return -1;
    }
}
