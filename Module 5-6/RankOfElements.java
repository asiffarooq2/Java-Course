import java.util.Scanner;

public class RankOfElements {

    // Method to find the rank (sorted position) of each element
    public static int[] findRanks(int[] arr) {

        int n = arr.length;
        int[] rank = new int[n];

        // Compare every element with every other element
        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (arr[j] < arr[i]) {
                    count++;
                }
            }

            rank[i] = count;
        }

        return rank;
    }

    // Main method
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Read the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scn.nextInt();

        // Create the array
        int[] arr = new int[n];

        // Read array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Find the ranks
        int[] rank = findRanks(arr);

        // Display the result
        System.out.println("\nPosition of each element in the sorted array:");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " -> " + rank[i]);
        }

        scn.close();
    }
}
