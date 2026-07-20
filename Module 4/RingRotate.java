import java.util.Scanner;

public class RingRotate {

    // Main method
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Read matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = scn.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scn.nextInt();

        // Create the matrix
        int[][] matrix = new int[rows][cols];

        // Read matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }

        // Read shell number and rotation count
        System.out.print("Enter the shell number: ");
        int shell = scn.nextInt();

        System.out.print("Enter the number of rotations: ");
        int rotations = scn.nextInt();

        // Rotate the specified shell
        rotateRing(matrix, shell, rotations);

        // Display the updated matrix
        System.out.println("\nMatrix after rotation:");
        display(matrix);

        scn.close();
    }

    // Rotates the specified shell
    public static void rotateRing(int[][] matrix, int shell, int rotations) {

        int[] oneD = fill1DFrom2D(matrix, shell);

        rotate1D(oneD, rotations);

        fill2DFrom1D(matrix, oneD, shell);
    }

    // Extract shell into a 1D array
    public static int[] fill1DFrom2D(int[][] matrix, int shell) {

        int rmin = shell - 1;
        int cmin = shell - 1;
        int rmax = matrix.length - shell;
        int cmax = matrix[0].length - shell;

        int size = 2 * (rmax - rmin + cmax - cmin);
        int[] oneD = new int[size];

        int index = 0;

        // Left Wall
        for (int i = rmin; i <= rmax; i++) {
            oneD[index++] = matrix[i][cmin];
        }
        cmin++;

        // Bottom Wall
        for (int j = cmin; j <= cmax; j++) {
            oneD[index++] = matrix[rmax][j];
        }
        rmax--;

        // Right Wall
        for (int i = rmax; i >= rmin; i--) {
            oneD[index++] = matrix[i][cmax];
        }
        cmax--;

        // Top Wall
        for (int j = cmax; j >= cmin; j--) {
            oneD[index++] = matrix[rmin][j];
        }

        return oneD;
    }

    // Rotate the 1D array
    public static void rotate1D(int[] arr, int rotations) {

        rotations = rotations % arr.length;

        if (rotations < 0) {
            rotations += arr.length;
        }

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, rotations - 1);
        reverse(arr, rotations, arr.length - 1);
    }

    // Reverse a part of the array
    public static void reverse(int[] arr, int left, int right) {

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    // Put the rotated values back into the shell
    public static void fill2DFrom1D(int[][] matrix, int[] oneD, int shell) {

        int rmin = shell - 1;
        int cmin = shell - 1;
        int rmax = matrix.length - shell;
        int cmax = matrix[0].length - shell;

        int index = 0;

        // Left Wall
        for (int i = rmin; i <= rmax; i++) {
            matrix[i][cmin] = oneD[index++];
        }
        cmin++;

        // Bottom Wall
        for (int j = cmin; j <= cmax; j++) {
            matrix[rmax][j] = oneD[index++];
        }
        rmax--;

        // Right Wall
        for (int i = rmax; i >= rmin; i--) {
            matrix[i][cmax] = oneD[index++];
        }
        cmax--;

        // Top Wall
        for (int j = cmax; j >= cmin; j--) {
            matrix[rmin][j] = oneD[index++];
        }
    }

    // Display the matrix
    public static void display(int[][] matrix) {

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
