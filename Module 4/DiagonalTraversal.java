import java.util.Scanner;

public class DiagonalTraversal {

    // Main method
    public static void main(String[] args) {

        // Create Scanner object
        Scanner scn = new Scanner(System.in);

        // Read the size of the matrix
        System.out.print("Enter the size of the matrix (n x n): ");
        int n = scn.nextInt();

        // Create the matrix
        int[][] matrix = new int[n][n];

        // Read matrix elements
        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }

        // Display the diagonal traversal
        System.out.println("\nDiagonal Traversal:");

        // Print diagonals starting from the first row
        for (int gap = 0; gap < n; gap++) {

            int row = 0;
            int col = gap;

            while (row < n && col < n) {
                System.out.print(matrix[row][col] + " ");
                row++;
                col++;
            }

            System.out.println();
        }

        // Print diagonals starting from the first column (excluding the first row)
        for (int gap = 1; gap < n; gap++) {

            int row = gap;
            int col = 0;

            while (row < n && col < n) {
                System.out.print(matrix[row][col] + " ");
                row++;
                col++;
            }

            System.out.println();
        }

        scn.close();
    }
}
