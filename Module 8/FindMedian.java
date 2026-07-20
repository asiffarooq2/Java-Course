import java.util.Arrays;
import java.util.Scanner;

public class FindMedian {

    // Method to find the median of an array
    public double findMedian(int[] arr) {

        // Sort the array
        Arrays.sort(arr);

        int n = arr.length;

        // If the number of elements is odd
        if (n % 2 != 0) {
            return arr[n / 2];
        }
        // If the number of elements is even
        else {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create object
        FindMedian obj = new FindMedian();

        // Input number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Create array
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find and display the median
        double median = obj.findMedian(arr);

        System.out.println("Median = " + median);

        sc.close();
    }
}