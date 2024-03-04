import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRan = 1;
        int maxRan = 100;
        int maxAttempt = 5;
        int score = 0;

        System.out.println("Welcome to NumberGame");

        boolean playAgain = true;
        while (playAgain) {
            int randomNum = random.nextInt(maxRan - minRan + 1) + minRan;
            int attemptCount = 0;
            boolean guessedCorrectly = false;

            System.out.println("I Gussed a number between " + minRan + " and " + maxRan + ". You have "
                    + maxAttempt + " attempts.");

            while (attemptCount < maxAttempt && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attemptCount++;

                if (guess < randomNum) {
                    System.out.println("Too low! Try again.");
                } else if (guess > randomNum) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the correct number: " + randomNum);
                    guessedCorrectly = true;
                    score += maxAttempt - attemptCount + 1;
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, Game Over. The correct number was: " + randomNum);
            }

            System.out.print("Your current score is: " + score);
            System.out.println("\nDo you want to play again? (yes/no)");
            String playAgainResponse = scanner.next();
            playAgain = playAgainResponse.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
