import java.util.Scanner;

public class ColumnWithMinZeros {

    // Method to return the column with the minimum number of zeros
    public static int[] getColumnWithMinZeros(int[][] array2D) {

        int rows = array2D.length;
        int cols = array2D[0].length;

        int minZeroCount = rows + 1;
        int minColumnIndex = 0;

        // Check each column
        for (int j = 0; j < cols; j++) {
            int zeroCount = 0;

            // Count zeros in the current column
            for (int i = 0; i < rows; i++) {
                if (array2D[i][j] == 0) {
                    zeroCount++;
                }
            }

            // Update minimum zero count
            if (zeroCount < minZeroCount) {
                minZeroCount = zeroCount;
                minColumnIndex = j;
            }
        }

        // Store the required column in a 1D array
        int[] result = new int[rows];
        for (int i = 0; i < rows; i++) {
            result[i] = array2D[i][minColumnIndex];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        // Create the 2D array
        int[][] array2D = new int[rows][cols];

        // Input elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array2D[i][j] = sc.nextInt();
            }
        }

        // Get the column with the minimum number of zeros
        int[] result = getColumnWithMinZeros(array2D);

        // Display the result
        System.out.println("Column with the minimum number of zeros:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}