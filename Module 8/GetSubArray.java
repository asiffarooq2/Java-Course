import java.util.Scanner;

public class GetSubArray {

    // Method to return a sub-array from the given array
    public int[] getSubArray(int[] arr, int startIndex, int endIndex) {

        // Calculate the size of the sub-array
        int length = endIndex - startIndex + 1;

        // Create the sub-array
        int[] result = new int[length];

        // Copy elements from the original array
        for (int i = startIndex; i <= endIndex; i++) {
            result[i - startIndex] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create object
        GetSubArray obj = new GetSubArray();

        // Input number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Create array
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input start and end indices
        System.out.print("Enter the start index: ");
        int startIndex = sc.nextInt();

        System.out.print("Enter the end index: ");
        int endIndex = sc.nextInt();

        // Get the sub-array
        int[] subArray = obj.getSubArray(arr, startIndex, endIndex);

        // Display the sub-array
        System.out.print("Sub-array: ");
        for (int num : subArray) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}