import java.util.HashSet;
import java.util.Scanner;

public class FindMissingNumber {

    // Method to find the missing number
    public int findMissingNumber(int[] arr, int n) {

        HashSet<Integer> numbers = new HashSet<>();

        // Store all array elements in the HashSet
        for (int num : arr) {
            numbers.add(num);
        }

        // Check numbers from 1 to n + 1
        for (int i = 1; i <= n + 1; i++) {
            if (!numbers.contains(i)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create object
        FindMissingNumber obj = new FindMissingNumber();

        // Input array size
        System.out.print("Enter the size of the array (excluding the missing number): ");
        int n = sc.nextInt();

        // Create the array
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " different numbers between 1 and " + (n + 1) + ":");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find the missing number
        int missingNumber = obj.findMissingNumber(arr, n);

        // Display the result
        System.out.println("The missing number is: " + missingNumber);

        sc.close();
    }
}