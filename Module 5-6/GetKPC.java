import java.util.*;

public class GetKPC {

    // Mapping of digits to corresponding keypad characters
    static Character[][] numberToCharMap;

    // Recursive method to generate all possible combinations
    public static List<String> getKPC(int[] numbers, int length, int index, String current) {

        // Base case
        if (index == length) {
            return new ArrayList<>(Collections.singletonList(current));
        }

        List<String> result = new ArrayList<>();

        // Get all characters corresponding to the current digit
        for (char ch : numberToCharMap[numbers[index]]) {
            result.addAll(getKPC(numbers, length, index + 1, current + ch));
        }

        return result;
    }

    // Initialize the keypad mapping
    public static void generateNumberToCharMap() {

        numberToCharMap = new Character[10][];

        numberToCharMap[0] = new Character[] { '0' };
        numberToCharMap[1] = new Character[] { '1' };
        numberToCharMap[2] = new Character[] { 'a', 'b', 'c' };
        numberToCharMap[3] = new Character[] { 'd', 'e', 'f' };
        numberToCharMap[4] = new Character[] { 'g', 'h', 'i' };
        numberToCharMap[5] = new Character[] { 'j', 'k', 'l' };
        numberToCharMap[6] = new Character[] { 'm', 'n', 'o' };
        numberToCharMap[7] = new Character[] { 'p', 'q', 'r', 's' };
        numberToCharMap[8] = new Character[] { 't', 'u', 'v' };
        numberToCharMap[9] = new Character[] { 'w', 'x', 'y', 'z' };
    }

    // Main method
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        generateNumberToCharMap();

        // Read the number of digits
        System.out.print("Enter the number of digits: ");
        int n = scn.nextInt();

        int[] digits = new int[n];

        // Read the digits
        System.out.println("Enter the digits:");
        for (int i = 0; i < n; i++) {
            digits[i] = scn.nextInt();
        }

        // Generate all possible combinations
        List<String> combinations = getKPC(digits, n, 0, "");

        System.out.println("\nPossible Keypad Combinations:");
        for (String word : combinations) {
            System.out.println(word);
        }

        scn.close();
    }
}
