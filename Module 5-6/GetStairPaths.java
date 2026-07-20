
import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPaths {

    // Recursive method to return all possible paths
    public static ArrayList<String> getStairPaths(int n) {

        // Base case: Reached the top
        if (n == 0) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        // Base case: Invalid path
        if (n < 0) {
            return new ArrayList<>();
        }

        ArrayList<String> paths = new ArrayList<>();

        // Take 1 step
        ArrayList<String> path1 = getStairPaths(n - 1);
        for (String path : path1) {
            paths.add("1" + path);
        }

        // Take 2 steps
        ArrayList<String> path2 = getStairPaths(n - 2);
        for (String path : path2) {
            paths.add("2" + path);
        }

        // Take 3 steps
        ArrayList<String> path3 = getStairPaths(n - 3);
        for (String path : path3) {
            paths.add("3" + path);
        }

        return paths;
    }

    // Main method
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Read the number of stairs
        System.out.print("Enter the number of stairs: ");
        int n = scn.nextInt();

        // Get all possible paths
        ArrayList<String> result = getStairPaths(n);

        // Display the paths
        System.out.println("\nPossible Stair Paths:");
        System.out.println(result);

        scn.close();
    }
}