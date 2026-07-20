import java.util.Scanner;

public class RotateByNinety {

    // Main method
    public static void main(String[] args) {

        // Create Scanner object
        Scanner scn = new Scanner(System.in);

        // Read the size of the square matrix
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

        // Rotate the matrix by 90 degrees clockwise
        rotateBy90(matrix);

        // Display the rotated matrix
        System.out.println("\nMatrix after 90° clockwise rotation:");
        display(matrix);

        scn.close();
    }

    // Function to rotate the matrix by 90 degrees clockwise
    public static void rotateBy90(int[][] matrix) {

        int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse every row
        for (int i = 0; i < n; i++) {

            int left = 0;
            int right = n - 1;

            while (left < right) {

                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }

    // Function to display the matrix
    public static void display(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
