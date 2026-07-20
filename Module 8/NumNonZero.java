import java.util.Scanner;

public class NumNonZero {

    // Method to count the number of rows that do not contain any zero
    public static int numNonZeroRows(int[][] array2D) {
        int count = 0;

        // Check each row
        for (int i = 0; i < array2D.length; i++) {
            boolean hasZero = false;

            // Check every element in the current row
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j] == 0) {
                    hasZero = true;
                    break;
                }
            }

            // If the row has no zero, increase the count
            if (!hasZero) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Create the 2D array
        int[][] array2D = new int[rows][cols];

        // Input array elements
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array2D[i][j] = scanner.nextInt();
            }
        }

        // Find and display the number of non-zero rows
        int result = numNonZeroRows(array2D);

        System.out.println("Number of non-zero rows = " + result);

        scanner.close();
    }
}