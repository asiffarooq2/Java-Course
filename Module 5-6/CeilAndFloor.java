import java.util.Scanner;

public class CeilAndFloor {

    // Main method
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Read the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scn.nextInt();

        // Create the array
        int[] arr = new int[n];

        // Read the sorted array elements
        System.out.println("Enter the elements in ascending order:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Read the target value
        System.out.print("Enter the number to find ceil and floor: ");
        int d = scn.nextInt();

        int floor = -1;
        int ceil = -1;

        int left = 0;
        int right = n - 1;

        // Binary Search
        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == d) {
                floor = arr[mid];
                ceil = arr[mid];
                break;
            } else if (arr[mid] < d) {
                floor = arr[mid];
                left = mid + 1;
            } else {
                ceil = arr[mid];
                right = mid - 1;
            }
        }

        // Display the results
        System.out.println("Floor = " + floor);
        System.out.println("Ceil = " + ceil);

        scn.close();
    }
}