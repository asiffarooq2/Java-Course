import java.util.Scanner;

public class IdentifierValidator {

    // Method to check whether the identifier is valid
    public static boolean isValidIdentifier(String str) {

        // Check if the string is null or empty
        if (str == null || str.length() == 0) {
            return false;
        }

        // First character must be a letter or underscore
        if (!Character.isLetter(str.charAt(0)) && str.charAt(0) != '_') {
            return false;
        }

        // Remaining characters must be letters, digits, or underscores
        for (int i = 1; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!Character.isLetterOrDigit(ch) && ch != '_') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an identifier: ");
        String identifier = sc.nextLine();

        if (isValidIdentifier(identifier)) {
            System.out.println("\"" + identifier + "\" is a valid Java identifier.");
        } else {
            System.out.println("\"" + identifier + "\" is NOT a valid Java identifier.");
        }

        sc.close();
    }
}