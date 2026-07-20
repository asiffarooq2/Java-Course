
import java.util.Scanner;

public class TowerofHanoi {

    // Recursive method to solve the Tower of Hanoi problem
    public static void toh(int n, int source, int destination, int helper) {

        // Base case
        if (n == 0) {
            return;
        }

        // Move n-1 disks from source to helper
        toh(n - 1, source, helper, destination);

        // Move the largest disk from source to destination
        System.out.println("Move disk " + n + " from Tower " + source + " to Tower " + destination);

        // Move n-1 disks from helper to destination
        toh(n - 1, helper, destination, source);
    }

    // Main method
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Read the number of disks
        System.out.print("Enter the number of disks: ");
        int n = scn.nextInt();

        // Read the tower numbers
        System.out.print("Enter the number for the source tower: ");
        int source = scn.nextInt();

        System.out.print("Enter the number for the destination tower: ");
        int destination = scn.nextInt();

        System.out.print("Enter the number for the helper tower: ");
        int helper = scn.nextInt();

        // Solve the Tower of Hanoi problem
        System.out.println("\nSteps to solve the Tower of Hanoi:");
        toh(n, source, destination, helper);

        scn.close();
    }
}