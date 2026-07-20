import java.util.ArrayList;
import java.util.Scanner;

public class ReverseList {

    // Main method
    public static void main(String[] args) {

        // Create Scanner object
        Scanner scn = new Scanner(System.in);

        // Read the number of elements
        System.out.print("Enter the number of elements in the list: ");
        int n = scn.nextInt();

        // Create the ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Read the elements
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            list.add(scn.nextInt());
        }

        // Reverse the list
        ArrayList<Integer> reversedList = reverse(list);

        // Display the reversed list
        System.out.println("Reversed List:");
        System.out.println(reversedList);

        scn.close();
    }

    // Method to reverse the ArrayList
    public static ArrayList<Integer> reverse(ArrayList<Integer> list) {

        ArrayList<Integer> reversed = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }

        return reversed;
    }
}
