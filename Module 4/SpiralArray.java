import java.util.Scanner;

public class SpiralArray {

    // Main method
    public static void main(String[] args) {

        // Create Scanner object
        Scanner scn = new Scanner(System.in);

        // Read the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scn.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scn.nextInt();

        // Check for invalid dimensions
        if (rows <= 0 || cols <= 0) {
            System.out.println("Array dimensions cannot be zero.");
            scn.close();
            return;
        }

        // Create the 2D array
        int[][] matrix = new int[rows][cols];

        // Read the matrix elements
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }

        // Initialize boundaries
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        int totalElements = rows * cols;
        int count = 0;

        System.out.println("\nSpiral Order Traversal:");

        while (count < totalElements) {

            // Traverse Top Row
            for (int col = left; col <= right && count < totalElements; col++) {
                System.out.print(matrix[top][col] + " ");
                count++;
            }
            top++;

            // Traverse Right Column
            for (int row = top; row <= bottom && count < totalElements; row++) {
                System.out.print(matrix[row][right] + " ");
                count++;
            }
            right--;

            // Traverse Bottom Row
            for (int col = right; col >= left && count < totalElements; col--) {
                System.out.print(matrix[bottom][col] + " ");
                count++;
            }
            bottom--;

            // Traverse Left Column
            for (int row = bottom; row >= top && count < totalElements; row--) {
                System.out.print(matrix[row][left] + " ");
                count++;
            }
            left++;
        }

        System.out.println();

        scn.close();
    }
}
