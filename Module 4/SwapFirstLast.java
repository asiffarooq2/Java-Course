import java.util.ArrayList;
import java.util.Scanner;

public class SwapFirstLast {

    // Method to swap the first and last elements
    public static ArrayList<String> swapFirstLast(ArrayList<String> list) {

        // Check if the list has more than one element
        if (list.size() > 1) {

            String temp = list.get(0);
            list.set(0, list.get(list.size() - 1));
            list.set(list.size() - 1, temp);
        }

        return list;
    }

    // Main method
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Read the number of strings
        System.out.print("Enter the number of strings: ");
        int n = scn.nextInt();
        scn.nextLine(); // Consume the newline character

        // Create the ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Read the strings
        System.out.println("Enter the strings:");

        for (int i = 0; i < n; i++) {
            list.add(scn.nextLine());
        }

        // Swap the first and last elements
        swapFirstLast(list);

        // Display the updated list
        System.out.println("ArrayList after swapping the first and last elements:");
        System.out.println(list);

        scn.close();
    }
}