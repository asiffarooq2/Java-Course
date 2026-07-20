import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromePartitioning {

    // Method to check whether a substring is a palindrome
    public static boolean isPalindrome(String str, int start, int end) {

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // Backtracking method to generate all palindrome partitions
    public static void partition(String str, int index,
            List<String> current,
            List<List<String>> result) {

        // If the entire string is processed
        if (index == str.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Try every possible substring
        for (int i = index; i < str.length(); i++) {

            if (isPalindrome(str, index, i)) {

                // Add the palindrome substring
                current.add(str.substring(index, i + 1));

                // Recur for the remaining string
                partition(str, i + 1, current, result);

                // Backtrack
                current.remove(current.size() - 1);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        List<List<String>> result = new ArrayList<>();

        partition(str, 0, new ArrayList<>(), result);

        System.out.println("\nAll Palindrome Partitions:");

        for (List<String> list : result) {
            System.out.println(list);
        }

        sc.close();
    }
}