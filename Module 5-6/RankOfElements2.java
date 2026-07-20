
    
import java.util.Scanner;

public class RankOfElements2 {

    // Method to find the sorted position (1-based rank) of each element
    public static int[] findRanks(int[] arr) {

        int n = arr.length;
        int[] rank = new int[n];

        for (int i = 0; i < n; i++) {

            int position = 1; // Positions start from 1

            for (int j = 0; j < n; j++) {
                if (arr[j] < arr[i]) {
                    position++;
                }
            }

            rank[i] = position;
        }

        return rank;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Read number of elements
        System.out.print("Enter the number of elements: ");
        int n = scn.nextInt();

        int[] arr = new int[n];

        // Read array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Find ranks
        int[] rank = findRanks(arr);

        // Print the positions
        System.out.println("\nPositions in the sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(rank[i] + " ");
        }

        System.out.println();

        scn.close();
    }
}
    

