import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReturnDuplicates {

    // Method to find and return duplicate elements
    public int[] findDuplicates(int[] arr) {

        Set<Integer> uniqueValues = new HashSet<>();
        Set<Integer> duplicateValues = new HashSet<>();

        // Check for duplicates
        for (int num : arr) {
            if (!uniqueValues.add(num)) {
                duplicateValues.add(num);
            }
        }

        // Convert the duplicate set into an array
        int[] result = new int[duplicateValues.size()];
        int index = 0;

        for (int num : duplicateValues) {
            result[index] = num;
            index++;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create object
        ReturnDuplicates obj = new ReturnDuplicates();

        // Input number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Create the array
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find duplicates
        int[] result = obj.findDuplicates(arr);

        // Display the duplicates
        if (result.length > 0) {
            System.out.print("Duplicate elements: ");
            for (int num : result) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("No duplicate elements found.");
        }

        sc.close();
    }
}
