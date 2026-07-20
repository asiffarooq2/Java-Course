import java.util.Scanner;

public class NQueens {

    static int N;

    // Left Diagonal (row - col + N - 1)
    static int[] leftDiagonal;

    // Right Diagonal (row + col)
    static int[] rightDiagonal;

    // Row array
    static int[] rowArray;

    // Print the chessboard
    public static void printSolution(int[][] board) {

        System.out.println("\nOne Possible Solution:\n");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Recursive method to solve the N-Queens problem
    public static boolean solveNQueensUtil(int[][] board, int col) {

        // Base case
        if (col >= N) {
            return true;
        }

        // Try placing a queen in every row of the current column
        for (int row = 0; row < N; row++) {

            if (leftDiagonal[row - col + N - 1] == 0 &&
                    rightDiagonal[row + col] == 0 &&
                    rowArray[row] == 0) {

                // Place the queen
                board[row][col] = 1;
                leftDiagonal[row - col + N - 1] = 1;
                rightDiagonal[row + col] = 1;
                rowArray[row] = 1;

                // Recur for the next column
                if (solveNQueensUtil(board, col + 1)) {
                    return true;
                }

                // Backtrack
                board[row][col] = 0;
                leftDiagonal[row - col + N - 1] = 0;
                rightDiagonal[row + col] = 0;
                rowArray[row] = 0;
            }
        }

        return false;
    }

    // Driver method
    public static boolean solveNQueens() {

        int[][] board = new int[N][N];

        if (!solveNQueensUtil(board, 0)) {
            System.out.println("Solution does not exist.");
            return false;
        }

        printSolution(board);
        return true;
    }

    // Main method
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        N = scn.nextInt();

        leftDiagonal = new int[2 * N];
        rightDiagonal = new int[2 * N];
        rowArray = new int[N];

        solveNQueens();

        scn.close();
    }
}
