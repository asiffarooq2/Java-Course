import java.util.Scanner;

public class FindEvenNumbers {

    // Method to return all even numbers from the array
    public int[] findEvenNumbers(int[] numbers) {

        // Create an empty array to store even numbers
        int[] evenNumbers = new int[0];

        // Check each element of the array
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {

                // Create a new array with one extra position
                int[] newEvenNumbers = new int[evenNumbers.length + 1];

                // Copy previous even numbers
                System.arraycopy(evenNumbers, 0, newEvenNumbers, 0, evenNumbers.length);

                // Add the new even number
                newEvenNumbers[evenNumbers.length] = numbers[i];

                // Update the reference
                evenNumbers = newEvenNumbers;
            }
        }

        return evenNumbers;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create object
        FindEvenNumbers obj = new FindEvenNumbers();

        // Input number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Create the array
        int[] numbers = new int[n];

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Find even numbers
        int[] evenNumbers = obj.findEvenNumbers(numbers);

        // Display the even numbers
        System.out.print("Even numbers: ");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}