import java.util.Scanner;

public class CheckPalindrome {

    // Method to check whether the string is a palindrome
    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Read the input string
        System.out.print("Enter a string: ");
        String input = scn.nextLine();

        // Check whether the string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is Not a Palindrome.");
        }

        scn.close();
    }
}