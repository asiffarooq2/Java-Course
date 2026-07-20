import java.util.Scanner;

public class SubstringCheck {

    // Method to check whether str2 is a substring of str1
    public static boolean isSubstring(String str1, String str2) {

        int index = str1.indexOf(str2);

        return index >= 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the main string
        System.out.print("Enter the main string: ");
        String str1 = sc.nextLine();

        // Read the substring
        System.out.print("Enter the substring: ");
        String str2 = sc.nextLine();

        // Check whether the substring exists
        if (isSubstring(str1, str2)) {
            System.out.println("\"" + str2 + "\" is a substring of \"" + str1 + "\"");
        } else {
            System.out.println("\"" + str2 + "\" is not a substring of \"" + str1 + "\"");
        }

        sc.close();
    }
}