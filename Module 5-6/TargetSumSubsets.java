import java.util.Scanner;

public class TargetSumSubsets {

    // Recursive method to print all target sum subsets
    public static void printTargetSumSubsets(int[] arr, int idx,
            String subset, int sum, int target) {

        // Base case
        if (idx == arr.length) {

            if (sum == target) {
                System.out.println(subset + ".");
            }

            return;
        }

        // Include the current element
        printTargetSumSubsets(arr,
                idx + 1,
                subset + arr[idx] + ", ",
                sum + arr[idx],
                target);

        // Exclude the current element
        printTargetSumSubsets(arr,
                idx + 1,
                subset,
                sum,
                target);
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

        // Read the target sum
        System.out.print("Enter the target sum: ");
        int target = scn.nextInt();

        System.out.println("\nSubsets having Target Sum:");

        // Print all target sum subsets
        printTargetSumSubsets(arr, 0, "", 0, target);

        scn.close();
    }
}
