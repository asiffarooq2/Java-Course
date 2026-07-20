import java.util.Scanner;

public class StringFun {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Read the number of characters
        System.out.print("Enter the number of characters: ");
        int n = scn.nextInt();

        // Read the string
        scn.nextLine(); // Consume newline
        System.out.print("Enter the string: ");
        String original = scn.nextLine();

        // Validate the length
        if (original.length() != n) {
            System.out.println("Warning: The entered string length does not match the specified number of characters.");
        }

        // Display the original string
        System.out.println("\nOriginal String: " + original);

        // Reverse the string
        String reverse = new StringBuilder(original).reverse().toString();

        // Display the reversed string
        System.out.println("Reversed String: " + reverse);

        // Concatenate the original and reversed strings
        String concatenated = original + " (" + reverse + ")";

        // Display the concatenated string
        System.out.println("Concatenated String: " + concatenated);

        scn.close();
    }
}