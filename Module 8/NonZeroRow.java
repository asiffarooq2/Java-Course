import java.util.Scanner;

public class NonZeroRow {

    // Method to check whether a row is a non-zero row
    public static boolean isNonZeroRow(int row, int[][] array2D) {

        // Check for invalid row index
        if (row < 0 || row >= array2D.length) {
            return false;
        }

        // Traverse the specified row
        for (int i = 0; i < array2D[row].length; i++) {

            if (array2D[row][i] == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the dimensions of the matrix
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] array2D = new int[rows][cols];

        // Read the matrix elements
        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                array2D[i][j] = sc.nextInt();
            }
        }

        // Read the row index
        System.out.print("Enter the row index to check: ");
        int row = sc.nextInt();

        // Check whether the row is non-zero
        if (isNonZeroRow(row, array2D)) {
            System.out.println("Row " + row + " is a Non-Zero Row.");
        } else {
            System.out.println("Row " + row + " is NOT a Non-Zero Row.");
        }

        sc.close();
    }
}