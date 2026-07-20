import java.util.Scanner;

public class ReversePairsMergeSort {

    // Merge Sort function
    public static int mergeSort(int[] arr, int left, int right) {

        int count = 0;

        if (left < right) {

            int mid = left + (right - left) / 2;

            // Count in left half
            count += mergeSort(arr, left, mid);

            // Count in right half
            count += mergeSort(arr, mid + 1, right);

            // Count reverse pairs across halves
            count += countPairs(arr, left, mid, right);

            // Merge the two halves
            merge(arr, left, mid, right);
        }

        return count;
    }

    // Count reverse pairs
    public static int countPairs(int[] arr, int left, int mid, int right) {

        int count = 0;
        int j = mid + 1;

        for (int i = left; i <= mid; i++) {

            while (j <= right && arr[i] > 2L * arr[j]) {
                j++;
            }

            count += (j - (mid + 1));
        }

        return count;
    }

    // Merge two sorted halves
    public static void merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }
    }

    // Print array
    public static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int reversePairs = mergeSort(arr, 0, n - 1);

        System.out.println("\nSorted Array:");
        printArray(arr);

        System.out.println("Number of Reverse Pairs = " + reversePairs);

        sc.close();
    }
}