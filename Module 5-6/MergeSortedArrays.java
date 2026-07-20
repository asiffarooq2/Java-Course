import java.util.Scanner;

public class MergeSortedArrays {

    // Bubble Sort method
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    // Merge two sorted arrays
    public static int[] mergeArrays(int[] arr1, int[] arr2) {

        int[] merged = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }

    // Print array
    public static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Read first array
        System.out.print("Enter the size of the first array: ");
        int n1 = scn.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scn.nextInt();
        }

        // Read second array
        System.out.print("Enter the size of the second array: ");
        int n2 = scn.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scn.nextInt();
        }

        // Sort both arrays
        bubbleSort(arr1);
        bubbleSort(arr2);

        // Merge arrays
        int[] merged = mergeArrays(arr1, arr2);

        // Display results
        System.out.println("\nSorted First Array:");
        printArray(arr1);

        System.out.println("Sorted Second Array:");
        printArray(arr2);

        System.out.println("Merged Sorted Array:");
        printArray(merged);

        scn.close();
    }
}
