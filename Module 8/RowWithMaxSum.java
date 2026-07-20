import java.util.Scanner;

public class RowWithMaxSum {

    // Method to find the row with the maximum sum
    public static int[] getRowWithMaxSum(int[][] array2D) {

        int[] maxRow = array2D[0];
        int maxSum = 0;

        // Find the sum of the first row
        for (int j = 0; j < array2D[0].length; j++) {
            maxSum += array2D[0][j];
        }

        // Check the remaining rows
        for (int i = 1; i < array2D.length; i++) {
            int sum = 0;

            for (int j = 0; j < array2D[i].length; j++) {
                sum += array2D[i][j];
            }

            // Update maximum sum and row
            if (sum > maxSum) {
                maxSum = sum;
                maxRow = array2D[i];
            }
        }

        return maxRow;
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

        // Input array elements
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array2D[i][j] = sc.nextInt();
            }
        }

        // Get the row with the maximum sum
        int[] result = getRowWithMaxSum(array2D);

        // Display the row
        System.out.println("Row with the maximum sum:");

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}