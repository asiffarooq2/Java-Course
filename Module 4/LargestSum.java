import java.util.Scanner;

public class LargestSum {

    // Main method
    public static void main(String[] args) {

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

        // Find the maximum contiguous sum
        int maxSum = maxSubArraySum(arr);

        // Display the result
        System.out.println("Maximum Contiguous Sum: " + maxSum);

        scn.close();
    }

    // Method to calculate the maximum contiguous subarray sum
    public static int maxSubArraySum(int[] arr) {

        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;

        for (int i = 0; i < arr.length; i++) {

            maxEndingHere = maxEndingHere + arr[i];

            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
            }

            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }

        return maxSoFar;
    }
}
