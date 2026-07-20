import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListQueries {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Read the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scn.nextInt();

        // Create the ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Read the elements
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            list.add(scn.nextInt());
        }

        // Read the query type
        System.out.print("Enter the query type (1 or 2): ");
        int q = scn.nextInt();

        if (q == 1) {

            // Insert element at a given index
            System.out.print("Enter the index and value to insert: ");
            int p = scn.nextInt();
            int r = scn.nextInt();

            if (p >= 0 && p <= list.size()) {
                list.add(p, r);

                System.out.println("Updated ArrayList:");
                System.out.println(list);
            } else {
                System.out.println("Invalid index");
            }

        } else if (q == 2) {

            // Find the last occurrence of an element
            System.out.print("Enter the value to search: ");
            int p = scn.nextInt();

            System.out.println("Last occurrence index: " + list.lastIndexOf(p));

        } else {
            System.out.println("Invalid query type");
        }

        scn.close();
    }
}
