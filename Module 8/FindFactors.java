import java.util.ArrayList;
import java.util.Scanner;

public class FindFactors {

    // Method to find all factors of a given number
    public ArrayList<Integer> findFactors(int number) {

        // Create an ArrayList to store the factors
        ArrayList<Integer> factors = new ArrayList<>();

        // Find all factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }

        return factors;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create object
        FindFactors obj = new FindFactors();

        // Input the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Find the factors
        ArrayList<Integer> factors = obj.findFactors(number);

        // Display the factors
        System.out.println("Factors of " + number + ":");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        sc.close();
    }
}