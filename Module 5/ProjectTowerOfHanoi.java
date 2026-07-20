public class ProjectTowerOfHanoi {

    // Recursive method to solve Tower of Hanoi
    public static void toh(int n, int source, int destination, int helper) {

        // Base case
        if (n == 0) {
            return;
        }

        // Move n-1 disks from source to helper
        toh(n - 1, source, helper, destination);

        // Move the largest disk to destination
        System.out.println("Move disk " + n +
                " from Tower " + source +
                " to Tower " + destination);

        // Move n-1 disks from helper to destination
        toh(n - 1, helper, destination, source);
    }

    // Main method
    public static void main(String[] args) {

        int disks = 6;

        System.out.println("Instructions to move 6 disks from Tower 1 to Tower 2 using Tower 3:\n");

        toh(disks, 1, 2, 3);
    }
}
