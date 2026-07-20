import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterCasePermutation {

    // Method to generate all possible letter case permutations
    public List<String> letterCasePermutation(String s) {

        List<String> result = new ArrayList<>();
        helper(s.toCharArray(), 0, result);
        return result;
    }

    // Recursive helper method
    public void helper(char[] str, int index, List<String> result) {

        // Base case
        if (index == str.length) {
            result.add(new String(str));
            return;
        }

        // If the current character is a letter
        if (Character.isLetter(str[index])) {

            // Lowercase
            str[index] = Character.toLowerCase(str[index]);
            helper(str, index + 1, result);

            // Uppercase
            str[index] = Character.toUpperCase(str[index]);
            helper(str, index + 1, result);

        } else {
            // If it is a digit, move to the next character
            helper(str, index + 1, result);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create object
        LetterCasePermutation obj = new LetterCasePermutation();

        // Input string
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        // Generate permutations
        List<String> result = obj.letterCasePermutation(s);

        // Display the result
        System.out.println("All possible strings:");
        for (String str : result) {
            System.out.println(str);
        }

        sc.close();
    }
}