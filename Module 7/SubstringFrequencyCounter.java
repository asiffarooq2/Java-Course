import java.util.LinkedHashMap;
import java.util.Scanner;

public class SubstringFrequencyCounter {

    // Method to count the occurrences of all substrings of length k
    public static void countSubstrings(String str, int k) {

        // Check for invalid length
        if (k <= 0 || k > str.length()) {
            System.out.println("Invalid substring length.");
            return;
        }

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        // Generate all substrings of length k
        for (int i = 0; i <= str.length() - k; i++) {

            String sub = str.substring(i, i + k);

            if (map.containsKey(sub)) {
                map.put(sub, map.get(sub) + 1);
            } else {
                map.put(sub, 1);
            }
        }

        // Display the frequency of each substring
        System.out.println("\nSubstring\tFrequency");

        for (String key : map.keySet()) {
            System.out.println(key + "\t\t" + map.get(key));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the input string
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        // Read the substring length
        System.out.print("Enter the length of substring: ");
        int k = sc.nextInt();

        // Count substring frequencies
        countSubstrings(str, k);

        sc.close();
    }
}