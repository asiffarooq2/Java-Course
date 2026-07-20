class WordMatch {
    private String secret;

    // Constructor
    public WordMatch(String word) {
        secret = word;
    }

    // Part (a)
    public int scoreGuess(String guess) {
        int count = 0;

        for (int i = 0; i <= secret.length() - guess.length(); i++) {
            if (secret.substring(i, i + guess.length()).equals(guess)) {
                count++;
            }
        }

        return count * guess.length() * guess.length();
    }

    // Part (b)
    public String findBetterGuess(String guess1, String guess2) {
        int score1 = scoreGuess(guess1);
        int score2 = scoreGuess(guess2);

        if (score1 > score2) {
            return guess1;
        } else if (score2 > score1) {
            return guess2;
        } else {
            if (guess1.compareTo(guess2) >= 0) {
                return guess1;
            } else {
                return guess2;
            }
        }
    }
}

public class WordMatchTest {
    public static void main(String[] args) {

        // Example 1
        WordMatch game1 = new WordMatch("mississippi");

        System.out.println("Secret Word: mississippi");
        System.out.println("-------------------------");
        System.out.println("Score of \"i\" = " + game1.scoreGuess("i"));
        System.out.println("Score of \"iss\" = " + game1.scoreGuess("iss"));
        System.out.println("Score of \"issipp\" = " + game1.scoreGuess("issipp"));
        System.out.println("Score of \"mississippi\" = " + game1.scoreGuess("mississippi"));

        System.out.println();

        // Example 2
        WordMatch game2 = new WordMatch("concatenation");

        System.out.println("Secret Word: concatenation");
        System.out.println("--------------------------");
        System.out.println("Score of \"ten\" = " + game2.scoreGuess("ten"));
        System.out.println("Score of \"nation\" = " + game2.scoreGuess("nation"));
        System.out.println("Better Guess (ten, nation): "
                + game2.findBetterGuess("ten", "nation"));

        System.out.println();

        System.out.println("Score of \"con\" = " + game2.scoreGuess("con"));
        System.out.println("Score of \"cat\" = " + game2.scoreGuess("cat"));
        System.out.println("Better Guess (con, cat): "
                + game2.findBetterGuess("con", "cat"));
    }
}
