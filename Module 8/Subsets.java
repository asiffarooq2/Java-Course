import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subsets {

    // List to store all subsets
    List<List<Integer>> output = new ArrayList<>();

    // Method to generate all subsets
    public List<List<Integer>> subsets(int[] nums) {

        helper(0, new ArrayList<Integer>(), nums);
        return output;
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
        Subsets obj = new Subsets();

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
        List<List<Integer>> result = obj.subsets(nums);

        // Display the subsets
        System.out.println("All possible subsets:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }

        sc.close();
    }
}