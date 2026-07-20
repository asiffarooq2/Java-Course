import java.util.ArrayList;
import java.util.Scanner;

public class FindUniqueElements {

    // Method to return all unique elements from the ArrayList
    public ArrayList<String> findUniqueElements(ArrayList<String> list) {

        // Create a new ArrayList to store unique elements
        ArrayList<String> uniqueList = new ArrayList<>();

        // Check each element in the input list
        for (String item : list) {

            // Add the element only if it is not already present
            if (!uniqueList.contains(item)) {
                uniqueList.add(item);
            }
        }

        return uniqueList;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create object
        FindUniqueElements obj = new FindUniqueElements();

        // Input number of elements
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Create the ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Input the strings
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

        // Find unique elements
        ArrayList<String> uniqueList = obj.findUniqueElements(list);

        // Display the result
        System.out.println("Unique elements:");
        for (String item : uniqueList) {
            System.out.println(item);
        }

        sc.close();
    }
}
