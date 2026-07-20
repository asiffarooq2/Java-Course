import java.util.ArrayList;
import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Input number of characters
        System.out.print("Enter the number of characters: ");
        int n = scn.nextInt();

        ArrayList<Character> characters = new ArrayList<>();

        // Input characters
        System.out.println("Enter the characters:");

        for (int i = 0; i < n; i++) {
            characters.add(scn.next().charAt(0));
        }

        // Construct the string from ArrayList
        StringBuilder sb = new StringBuilder();

        for (char ch : characters) {
            sb.append(ch);
        }

        String original = sb.toString();

        // Find length
        int length = original.length();

        // Reverse the string
        String reverse = new StringBuilder(original).reverse().toString();

        // Divide the string into two equal words
        if (length % 2 == 0) {

            String word1 = original.substring(0, length / 2);
            String word2 = original.substring(length / 2);

            System.out.println("\nOriginal String : " + original);
            System.out.println("Length          : " + length);
            System.out.println("Reverse String  : " + reverse);
            System.out.println("Word 1          : " + word1);
            System.out.println("Word 2          : " + word2);

        } else {

            System.out.println("\nOriginal String : " + original);
            System.out.println("Length          : " + length);
            System.out.println("Reverse String  : " + reverse);
            System.out.println("Cannot divide the string into two equal words because its length is odd.");
        }

        scn.close();
    }
}