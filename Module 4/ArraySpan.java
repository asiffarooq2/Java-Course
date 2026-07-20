import java.util.Scanner;

public class ArraySpan {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scn.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Read array elements
        System.out.println("Enter the " + n + " elements of the array:");

        for (int i = 0; i < n; i++) {
            int value = scn.nextInt();

            if (value > max) {
                max = value;
            }

            if (value < min) {
                min = value;
            }
        }

        // Calculate span
        int span = max - min;

        // Display results
        System.out.println("Maximum Element: " + max);
        System.out.println("Minimum Element: " + min);
        System.out.println("The span of the array is: " + span);

        scn.close();
    }
}