import java.util.Scanner;

public class MatrixMultiplication {

    // Main method
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Read the dimensions of the first matrix
        System.out.print("Enter the number of rows of the first matrix: ");
        int n1 = scn.nextInt();

        System.out.print("Enter the number of columns of the first matrix: ");
        int m1 = scn.nextInt();

        // Create the first matrix
        int[][] a1 = new int[n1][m1];

        // Read the elements of the first matrix
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                a1[i][j] = scn.nextInt();
            }
        }

        // Read the dimensions of the second matrix
        System.out.print("Enter the number of rows of the second matrix: ");
        int n2 = scn.nextInt();

        System.out.print("Enter the number of columns of the second matrix: ");
        int m2 = scn.nextInt();

        // Create the second matrix
        int[][] a2 = new int[n2][m2];

        // Read the elements of the second matrix
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                a2[i][j] = scn.nextInt();
            }
        }

        // Check if matrix multiplication is possible
        if (m1 != n2) {
            System.out.println("Invalid input");
        } else {

            // Create the product matrix
            int[][] product = new int[n1][m2];

            // Multiply the matrices
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m2; j++) {

                    product[i][j] = 0;

                    for (int k = 0; k < m1; k++) {
                        product[i][j] += a1[i][k] * a2[k][j];
                    }
                }
            }

            // Display the product matrix
            System.out.println("\nProduct Matrix:");

            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m2; j++) {
                    System.out.print(product[i][j] + "\t");
                }
                System.out.println();
            }
        }

        scn.close();
    }
}
