import java.util.Scanner;

public class MaximumSubarrayKConcatenation {

    // Kadane's Algorithm
    public static long kadane(int[] arr) {
        long maxSoFar = arr[0];
        long maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    // Maximum Prefix Sum
    public static long maxPrefixSum(int[] arr) {
        long sum = 0;
        long maxPrefix = Long.MIN_VALUE;

        for (int value : arr) {
            sum += value;
            maxPrefix = Math.max(maxPrefix, sum);
        }

        return maxPrefix;
    }

    // Maximum Suffix Sum
    public static long maxSuffixSum(int[] arr) {
        long sum = 0;
        long maxSuffix = Long.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {
            sum += arr[i];
            maxSuffix = Math.max(maxSuffix, sum);
        }

        return maxSuffix;
    }

    // Total Sum of Array
    public static long totalSum(int[] arr) {
        long sum = 0;

        for (int value : arr) {
            sum += value;
        }

        return sum;
    }

    // Maximum Subarray Sum for K Concatenations
    public static long maxSubarraySumKConcat(int[] arr, int k) {

        if (k == 1) {
            return kadane(arr);
        }

        long prefix = maxPrefixSum(arr);
        long suffix = maxSuffixSum(arr);
        long total = totalSum(arr);

        if (total > 0) {
            return suffix + prefix + (long) (k - 2) * total;
        } else {
            return suffix + prefix;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Read K
        System.out.print("Enter the value of K: ");
        int k = sc.nextInt();

        // Read array elements
        int[] arr = new int[n];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long answer = maxSubarraySumKConcat(arr, k);

        System.out.println("Maximum Subarray Sum of K Concatenated Array: " + answer);

        sc.close();
    }
}