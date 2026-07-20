import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrime {

    // Method to remove all prime numbers from the ArrayList
    public static void solution(ArrayList<Integer> list) {

        // Traverse the list from the end to safely remove elements
        for (int i = list.size() - 1; i >= 0; i--) {

            if (isPrime(list.get(i))) {
                list.remove(i);
            }
        }
    }

    // Method to check whether a number is prime
    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        // Check divisibility up to the square root of n
        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Read the number of elements
        System.out.print("Enter the number of integers: ");
        int n = scn.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        // Read the elements
        System.out.println("Enter the integers:");

        for (int i = 0; i < n; i++) {
            list.add(scn.nextInt());
        }

        // Remove prime numbers
        solution(list);

        // Display the modified list
        System.out.println("ArrayList after removing prime numbers:");
        System.out.println(list);

        scn.close();
    }
}