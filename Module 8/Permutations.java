import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutations {

    // List to store all permutations
    List<List<Integer>> ans = new ArrayList<>();

    // Method to generate all permutations
    public List<List<Integer>> permute(int[] nums) {

        helper(0, nums, new ArrayList<Integer>());
        return ans;
    }

    // Recursive helper method
    public void helper(int index, int[] nums, ArrayList<Integer> current) {

        // Base case
        if (current.size() == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Generate permutations using backtracking
        for (int i = index; i < nums.length; i++) {

            // Add current element
            current.add(nums[i]);

            // Swap elements
            swap(nums, i, index);

            // Recursive call
            helper(index + 1, nums, current);

            // Backtrack
            swap(nums, i, index);
            current.remove(current.size() - 1);
        }
    }

    // Method to swap two elements
    public void swap(int[] nums, int i, int index) {

        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create object
        Permutations obj = new Permutations();

        // Input number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Create array
        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Generate permutations
        List<List<Integer>> result = obj.permute(nums);

        // Display permutations
        System.out.println("All permutations:");
        for (List<Integer> permutation : result) {
            System.out.println(permutation);
        }

        sc.close();
    }
}