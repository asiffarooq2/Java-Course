import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutiveSequence {

    // Method to find the length of the longest consecutive sequence
    public int findLongestConsecutiveSequence(int[] arr) {

        Set<Integer> set = new HashSet<>();

        // Store all array elements in a HashSet
        for (int num : arr) {
            set.add(num);
        }

        int maxLength = 0;

        // Check each number
        for (int num : arr) {

            // Start a sequence only if the previous number does not exist
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int length = 1;

                // Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    length++;
                }

                // Update maximum length
                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create object
        LongestConsecutiveSequence obj = new LongestConsecutiveSequence();

        // Input number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Create array
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find the longest consecutive sequence
        int result = obj.findLongestConsecutiveSequence(arr);

        // Display the result
        System.out.println("Length of the longest consecutive sequence: " + result);

        sc.close();
    }
}