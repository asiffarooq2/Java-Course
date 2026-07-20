import java.util.Scanner;

public class CountFrequencyArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the input string
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        // Convert the string into a character array
        char[] ch = str.toCharArray();

        // Frequency array
        int[] freq = new int[ch.length];

        // Count frequency of each character
        for (int i = 0; i < ch.length; i++) {

            if (ch[i] == '0')
                continue;

            freq[i] = 1;

            for (int j = i + 1; j < ch.length; j++) {

                if (ch[i] == ch[j]) {
                    freq[i]++;
                    ch[j] = '0'; // Mark duplicate character
                }
            }
        }

        // Display the frequencies
        System.out.println("\nCharacter\tFrequency");

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] != '0' && ch[i] != ' ') {
                System.out.println(ch[i] + "\t\t" + freq[i]);
            }
        }

        sc.close();
    }
}