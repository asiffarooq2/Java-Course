class Level {
    private boolean goalReached;
    private int points;

    // Constructor
    public Level(boolean goalReached, int points) {
        this.goalReached = goalReached;
        this.points = points;
    }

    // Returns true if the goal was reached
    public boolean goalReached() {
        return goalReached;
    }

    // Returns the points earned for this level
    public int getPoints() {
        return points;
    }
}

class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    private boolean bonus;

    // Constructor
    public Game(Level l1, Level l2, Level l3, boolean bonus) {
        levelOne = l1;
        levelTwo = l2;
        levelThree = l3;
        this.bonus = bonus;
    }

    // Returns true if this is a bonus game
    public boolean isBonus() {
        return bonus;
    }

    // Simulates playing the game
    public void play() {
        // Simulation not required for this example
    }

    // Part (a)
    public int getScore() {
        int score = 0;

        if (levelOne.goalReached()) {
            score += levelOne.getPoints();

            if (levelTwo.goalReached()) {
                score += levelTwo.getPoints();

                if (levelThree.goalReached()) {
                    score += levelThree.getPoints();
                }
            }
        }

        if (isBonus()) {
            score *= 3;
        }

        return score;
    }

    // Part (b)
    public int playManyTimes(int num) {
        int highestScore = 0;

        for (int i = 0; i < num; i++) {
            play();

            int score = getScore();

            if (score > highestScore) {
                highestScore = score;
            }
        }

        return highestScore;
    }
}

public class GameTest {
    public static void main(String[] args) {

        // Create three levels
        Level level1 = new Level(true, 20);
        Level level2 = new Level(true, 30);
        Level level3 = new Level(true, 50);

        // Create a bonus game
        Game game = new Game(level1, level2, level3, true);

        // Display score
        System.out.println("Game Score: " + game.getScore());

        // Display highest score after playing 5 times
        System.out.println("Highest Score: " + game.playManyTimes(5));
    }
}