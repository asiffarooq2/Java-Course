import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTrial {

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the number of ArrayLists
        System.out.print("Enter the number of arrays: ");
        int n = sc.nextInt();

        // Create a 2D ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Read each ArrayList
        for (int i = 0; i < n; i++) {

            System.out.print("Enter the size of array " + (i + 1) + ": ");
            int size = sc.nextInt();

            ArrayList<Integer> temp = new ArrayList<>();

            System.out.println("Enter the elements:");

            for (int j = 0; j < size; j++) {
                temp.add(sc.nextInt());
            }

            list.add(temp);
        }

        // Read the number of queries
        System.out.print("Enter the number of queries: ");
        int queries = sc.nextInt();

        // Process each query
        for (int i = 0; i < queries; i++) {

            System.out.print("Enter the row and column: ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            try {
                System.out.println(list.get(row - 1).get(col - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}
