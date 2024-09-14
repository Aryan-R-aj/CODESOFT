
import java.util.Random;
import java.util.Scanner;

public class number_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int totalScore = 0;
        int rounds = 0;

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("Guess a number between 1 and 100. You have 10 attempts.");

            while (attempts < 10 && !hasGuessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess > numberToGuess) {
                    System.out.println("Too high, try again.");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low, try again.");
                } else {
                    System.out.println("Congratulations! ");
                    hasGuessedCorrectly = true;
                    totalScore += (10 - attempts + 1); 
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The number was: " + numberToGuess);
            }

            rounds++;
            System.out.print("Do you want to play again? (yes/noo): ");
            playAgain = sc.next().equalsIgnoreCase("yes");
        }

        System.out.println("Game Over! You played " + rounds + " rounds with a total score of " + totalScore + ".");
        sc.close();
    }
}
