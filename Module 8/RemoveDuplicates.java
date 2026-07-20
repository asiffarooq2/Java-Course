import java.util.Scanner;

public class RemoveDuplicates {

    // Method to remove duplicate elements from an array
    public int[] removeDuplicates(int[] arr) {

        int[] result = new int[arr.length];
        int index = 0;

        // Check each element
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            // Compare with elements already stored in result
            for (int j = 0; j < index; j++) {
                if (arr[i] == result[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, add it to result
            if (!isDuplicate) {
                result[index] = arr[i];
                index++;
            }
        }

        // Create a new array of the correct size
        int[] uniqueArray = new int[index];
        for (int i = 0; i < index; i++) {
            uniqueArray[i] = result[i];
        }

        return uniqueArray;
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

        // Create object and call the method
        RemoveDuplicates obj = new RemoveDuplicates();
        int[] result = obj.removeDuplicates(arr);

        // Display the array after removing duplicates
        System.out.println("Array after removing duplicates:");
        for (int value : result) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}