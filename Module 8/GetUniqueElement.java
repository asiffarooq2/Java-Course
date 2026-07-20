import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GetUniqueElement {

    // Method to return unique elements from two arrays
    public int[] getUniqueElements(int[] arr1, int[] arr2) {

        Set<Integer> set = new HashSet<>();

        // Add elements from the first array
        for (int num : arr1) {
            set.add(num);
        }

        // Add elements from the second array
        for (int num : arr2) {
            set.add(num);
        }

        // Convert the set into an array
        int[] result = new int[set.size()];
        int index = 0;

        for (int num : set) {
            result[index] = num;
            index++;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create object
        GetUniqueElement obj = new GetUniqueElement();

        // Input first array
        System.out.print("Enter the size of the first array: ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input second array
        System.out.print("Enter the size of the second array: ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Get unique elements
        int[] result = obj.getUniqueElements(arr1, arr2);

        // Display the result
        System.out.print("Unique elements from both arrays: ");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}