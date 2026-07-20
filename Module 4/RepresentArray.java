import java.util.Scanner;

public class RepresentArray {

    // Main method
    public static void main(String[] args) {

        // Create Scanner object
        Scanner scn = new Scanner(System.in);

        // Read the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scn.nextInt();

        // Read the number of columns
        System.out.print("Enter the number of columns: ");
        int cols = scn.nextInt();

        // Create a 2D array
        int[][] matrix = new int[rows][cols];

        // Read the elements of the matrix
        System.out.println("Enter the elements of the 2D array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }

        // Display the matrix
        System.out.println("\nThe entered 2D array is:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        scn.close();
    }
}
