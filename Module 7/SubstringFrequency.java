import java.util.Scanner;

public class SubstringFrequency {

    // Method to count the occurrences of a substring
    public static int countSubstring(String str, String sub) {

        int count = 0;
        int index = 0;

        // Continue searching until no more occurrences are found
        while (true) {

            index = str.indexOf(sub, index);

            if (index == -1) {
                break;
            }

            count++;

            // Move to the next possible occurrence
            index += sub.length();
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the main string
        System.out.print("Enter the main string: ");
        String str = sc.nextLine();

        // Read the substring
        System.out.print("Enter the substring to count: ");
        String sub = sc.nextLine();

        // Count the occurrences
        int result = countSubstring(str, sub);

        // Display the result
        System.out.println("\nThe substring \"" + sub + "\" appears "
                + result + " time(s) in the main string.");

        sc.close();
    }
}