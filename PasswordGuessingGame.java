import java.util.Random;
import java.util.Scanner;

public class PasswordGuessingGame {

    // Method to generate a random password between 1 and 100
    public static int generatePassword() {
        Random random = new Random();
        return random.nextInt(100) + 1; // Generates a number between 1 and 100
    }

    public static void main(String[] args) {
        int password = generatePassword(); // Generate a random password
        int attempts = 0; // Track the number of attempts made by the user
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        // Welcome message and game instructions
        System.out.println("Welcome to the Password Guessing Game!");
        System.out.println("I have selected a random password (between 1 and 100).");
        System.out.println("Try to guess it!");

        // Game loop
        while (true) {
            System.out.print("Enter your guess (a number between 1 and 100): ");
            String input = scanner.nextLine();

            // Validate user input
            int guess;
            try {
                guess = Integer.parseInt(input); // Attempt to parse the input to an integer
                if (guess < 1 || guess > 100) { // Check if the input is within range
                    System.out.println("Please enter a valid number between 1 and 100.");
                    continue; // Prompt user to re-enter if input is invalid
                }
            } catch (NumberFormatException e) { // Handle non-integer inputs
                System.out.println("Please enter a valid number between 1 and 100.");
                continue; // Prompt user to re-enter if input is invalid
            }

            attempts++; // Increment the attempt counter

            // Check if the guess is correct, too high, or too low
            if (guess < password) {
                System.out.println("Too low! Try again.");
            } else if (guess > password) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the password " + password + " in " + attempts + " attempts.");
                break; // End the game if the correct password is guessed
            }
        }

        scanner.close(); // Close the scanner to avoid resource leaks
    }
}
