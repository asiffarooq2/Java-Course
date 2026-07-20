import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {

    // Recursive method to print all non-empty subsequences
    public static void printSubsequences(int[] arr, int index, ArrayList<Integer> path) {

        // Base case
        if (index == arr.length) {

            // Print only non-empty subsequences
            if (!path.isEmpty()) {
                System.out.println(path);
            }
            return;
        }

        // Exclude the current element
        printSubsequences(arr, index + 1, path);

        // Include the current element
        path.add(arr[index]);

        printSubsequences(arr, index + 1, path);

        // Backtrack
        path.remove(path.size() - 1);
    }

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

        ArrayList<Integer> path = new ArrayList<>();

        System.out.println("\nAll Non-Empty Subsequences:");

        printSubsequences(arr, 0, path);

        scn.close();
    }
}