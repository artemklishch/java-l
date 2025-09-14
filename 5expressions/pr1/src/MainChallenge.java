public class MainChallenge {
    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        int finalScore = score;
//
//        if (gameOver) {
//            finalScore += (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }

//        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("The high score is " + calculateScore(true, 800, 5, 100));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        int finalScore = score;
//        if (gameOver) {
//            finalScore = score + (levelCompleted * bonus);
//        }
//        return finalScore;
        return gameOver ? score + (levelCompleted * bonus) : score;
    }

    public static int calculateMyAge() {
        return 10;
    }

}
