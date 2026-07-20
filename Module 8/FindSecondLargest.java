import java.util.Scanner;

public class FindSecondLargest {

    // Method to find the second largest element in the array
    public int findSecondLargest(int[] arr) {

        // If the array has fewer than two elements
        if (arr.length < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find the largest and second largest elements
        for (int num : arr) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // If no second largest element exists
        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create object
        FindSecondLargest obj = new FindSecondLargest();

        // Input the number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Create the array
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find the second largest element
        int result = obj.findSecondLargest(arr);

        // Display the result
        if (result == -1) {
            System.out.println("Second largest element does not exist.");
        } else {
            System.out.println("Second largest element is: " + result);
        }

        sc.close();
    }
}