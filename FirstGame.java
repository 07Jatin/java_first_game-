import java.util.Random;
import java.util.Scanner;

public class FirstGame {

    public static void main(String[] args) {
        // Create a scanner for user input using try-with-resources
        try (Scanner scanner = new Scanner(System.in)) {

            // Create a random number generator
            Random random = new Random();
            int secretNumber = random.nextInt(100) + 1; // 1 to 100

            int guess;
            int attempts = 0;

            System.out.println("🎯 Welcome to the Number Guessing Game!");
            System.out.println("I'm thinking of a number between 1 and 100. Try to guess it!");

            // Loop until the user guesses the number
            while (true) {
                System.out.print("Enter your guess: ");
                // Check if input is an integer
                if (!scanner.hasNextInt()) {
                    System.out.println("Please enter a valid integer.");
                    scanner.next(); // consume invalid input
                    continue;
                }
                guess = scanner.nextInt();
                attempts++;

                if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > secretNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("🎉 Correct! You guessed it in " + attempts + " attempts.");
                    break;
                }
            }
        }
    }
}
