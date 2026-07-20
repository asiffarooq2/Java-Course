import java.util.Scanner;

public class SaddlePoint {

    // Main method
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Read the size of the square matrix
        System.out.print("Enter the size of the square matrix: ");
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

        boolean found = false;

        // Find the saddle point
        for (int i = 0; i < n; i++) {

            // Find the minimum element in the current row
            int minCol = 0;

            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < matrix[i][minCol]) {
                    minCol = j;
                }
            }

            // Check whether it is the maximum in its column
            boolean isSaddlePoint = true;

            for (int k = 0; k < n; k++) {
                if (matrix[k][minCol] > matrix[i][minCol]) {
                    isSaddlePoint = false;
                    break;
                }
            }

            if (isSaddlePoint) {
                System.out.println("Saddle Point: " + matrix[i][minCol]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Invalid input");
        }

        scn.close();
    }
}
