import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UniquePermutation {

    // Set to store unique permutations
    Set<List<Integer>> ans = new HashSet<>();

    // Method to generate unique permutations
    public List<List<Integer>> permuteUnique(int[] nums) {

        // Sort the array so duplicate elements are adjacent
        Arrays.sort(nums);

        // Generate permutations
        helper(0, nums, new ArrayList<Integer>());

        // Convert the Set into a List
        return new ArrayList<>(ans);
    }

    // Recursive helper method
    public void helper(int index, int[] nums, ArrayList<Integer> current) {

        // Base case
        if (current.size() == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Generate permutations
        for (int i = index; i < nums.length; i++) {

            // Skip duplicate elements
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }

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
        UniquePermutation obj = new UniquePermutation();

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

        // Generate unique permutations
        List<List<Integer>> result = obj.permuteUnique(nums);

        // Display the result
        System.out.println("Unique permutations:");
        for (List<Integer> permutation : result) {
            System.out.println(permutation);
        }

        sc.close();
    }
}
