import java.util.Scanner;

public class ReverseString {

    // Method to reverse a string
    public static String reverseString(String str) {

        char[] ch = str.toCharArray();

        int start = 0;
        int end = ch.length - 1;

        while (start < end) {

            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;
        }

        return new String(ch);
    }

    // Method to reverse the order of words and reverse each word
    public static String reverseWordsAndSentence(String sentence) {

        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(reverseString(words[i])).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scn.nextLine();

        // Check whether the input is a single word or a sentence
        if (input.trim().contains(" ")) {

            String output = reverseWordsAndSentence(input);
            System.out.println("Reversed String: " + output);

        } else {

            String output = reverseString(input);
            System.out.println("Reversed String: " + output);
        }

        scn.close();
    }
}
