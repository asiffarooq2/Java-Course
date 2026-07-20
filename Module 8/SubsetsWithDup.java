import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SubsetsWithDup {

    // Set to store unique subsets
    Set<List<Integer>> output = new HashSet<>();

    // Method to generate subsets without duplicates
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        // Sort the array to handle duplicates
        Arrays.sort(nums);

        // Generate subsets
        helper(0, new ArrayList<Integer>(), nums);

        // Convert the Set into a List
        return new ArrayList<>(output);
    }

    // Recursive helper method
    public void helper(int index, ArrayList<Integer> current, int[] nums) {

        // If all elements are processed, store the subset
        if (index == nums.length) {
            output.add(new ArrayList<>(current));
            return;
        }

        // Exclude the current element
        helper(index + 1, current, nums);

        // Include the current element
        current.add(nums[index]);
        helper(index + 1, current, nums);

        // Backtrack
        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create object
        SubsetsWithDup obj = new SubsetsWithDup();

        // Input number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Create the array
        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Generate subsets
        List<List<Integer>> result = obj.subsetsWithDup(nums);

        // Display the subsets
        System.out.println("Unique subsets:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }

        sc.close();
    }
}
