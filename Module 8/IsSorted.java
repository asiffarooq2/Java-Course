import java.util.Scanner;

public class IsSorted {

    // Method to check whether the array is sorted in ascending order
    public boolean isSorted(int[] arr) {

        // Compare each element with the previous one
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Create the array
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create an object and call the method
        IsSorted obj = new IsSorted();
        boolean result = obj.isSorted(arr);

        // Display the result
        if (result) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }

        sc.close();
    }
}