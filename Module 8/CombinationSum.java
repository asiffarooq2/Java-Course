import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationSum {

    // Method to find all combinations whose sum equals the target
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        helper(candidates, target, 0, new ArrayList<Integer>(), result);
        return result;
    }

    // Recursive helper method
    public void helper(int[] candidates, int target, int index,
            ArrayList<Integer> current,
            List<List<Integer>> result) {

        // Base case: target achieved
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Base case: target exceeded or no elements left
        if (target < 0 || index == candidates.length) {
            return;
        }

        // Include the current element (can be chosen multiple times)
        current.add(candidates[index]);
        helper(candidates, target - candidates[index], index, current, result);

        // Backtrack
        current.remove(current.size() - 1);

        // Exclude the current element and move to the next
        helper(candidates, target, index + 1, current, result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create object
        CombinationSum obj = new CombinationSum();

        // Input number of candidates
        System.out.print("Enter the number of candidates: ");
        int n = sc.nextInt();

        int[] candidates = new int[n];

        // Input candidate values
        System.out.println("Enter the candidate numbers:");
        for (int i = 0; i < n; i++) {
            candidates[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();

        // Find combinations
        List<List<Integer>> result = obj.combinationSum(candidates, target);

        // Display result
        System.out.println("Possible combinations:");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }

        sc.close();
    }
}