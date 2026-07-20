import java.util.Scanner;

public class InverseArray {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scn.nextInt();

        // Create the original array
        int[] arr = new int[n];

        // Create the inverse array
        int[] inverse = new int[n];

        // Read array elements
        System.out.println("Enter the " + n + " elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Find the inverse of the array
        for (int i = 0; i < n; i++) {
            inverse[arr[i]] = i;
        }

        // Display the inverse array
        System.out.println("Inverse Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(inverse[i] + " ");
        }

        scn.close();
    }
}
