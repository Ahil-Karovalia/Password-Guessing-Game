# Password-Guessing-Game

This is a simple console-based password guessing game where a user tries to guess a randomly generated "password" (a number between 1 and 100). After each guess, the program provides feedback to help guide the user until they guess correctly.

# Features
  - Random Password Generation: A new random number between 1 and 100 is generated each time       the game starts.
  - Input Validation: Ensures the user enters a valid number within the specified range.
  - Feedback on Guesses: Indicates if a guess is too high, too low, or correct.
  - Attempts Tracking: Counts the number of attempts it took the user to guess the password.

# How to Play
1. Start the Game: When you run the program, it will display a welcome message and instructions.
2. Enter Your Guess: The program will prompt you to enter a number between 1 and 100.
3. Receive Feedback:
  - If your guess is too low, you will be prompted to try again with a higher number.
  - If your guess is too high, you will be prompted to try again with a lower number.
  - If your guess is correct, the program will congratulate you and display the number of          attempts you made.
4. End the Game: After guessing the correct number, the program will end.

# Code Structure
  - generatePassword: This method generates a random integer between 1 and 100 to serve as the     "password" for the game.
  - main:
    - Initializes the random password and starts the game loop.
    - Prompts the user to guess the password.
    - Checks the input validity and provides hints (too low or too high).
    - Ends the game when the user guesses the correct password.

# Example Output
Welcome to the Password Guessing Game!
I have selected a random password (between 1 and 100).
Try to guess it!

Enter your guess (a number between 1 and 100): 50
Too low! Try again.

Enter your guess (a number between 1 and 100): 75
Too high! Try again.

Enter your guess (a number between 1 and 100): 63
Congratulations! You've guessed the password 63 in 3 attempts.

# Running the Program
1. Ensure you have Java installed on your system.
2. Compile the program:

javac PasswordGuessingGame.java
3. Run the program:

java PasswordGuessingGame
