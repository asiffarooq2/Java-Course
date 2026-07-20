import java.util.ArrayList;
import java.util.Scanner;

public class KthPermutation {

    // Method to return the kth permutation
    public static String getPermutation(int n, int k) {

        ArrayList<Integer> numbers = new ArrayList<>();
        int[] factorial = new int[n + 1];

        factorial[0] = 1;

        // Compute factorials
        for (int i = 1; i <= n; i++) {
            factorial[i] = factorial[i - 1] * i;
            numbers.add(i);
        }

        // Convert k to zero-based index
        k--;

        StringBuilder result = new StringBuilder();

        // Build the kth permutation
        for (int i = n; i >= 1; i--) {

            int index = k / factorial[i - 1];

            result.append(numbers.get(index));

            numbers.remove(index);

            k = k % factorial[i - 1];
        }

        return result.toString();
    }

    // Main method
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Read n and k
        System.out.print("Enter the value of n: ");
        int n = scn.nextInt();

        System.out.print("Enter the value of k: ");
        int k = scn.nextInt();

        // Display the kth permutation
        System.out.println("The " + k + "th permutation is: " + getPermutation(n, k));

        scn.close();
    }
}