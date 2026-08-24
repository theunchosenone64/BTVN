package nguyennhathuy_5372.Lec05_Loops;

import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(20) + 1;
        int guess;
        int attempts = 0;

        System.out.println("=== NUMBER GUESSING GAME ===");
        System.out.println("Guess a number from 1-20!");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low! Guess higher.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Guess lower.");
            }
        } while (guess != secretNumber);

        System.out.println("Congratulations! You guessed the number! ");
        System.out.println("You got it in " + attempts + " attempts.");
    }
}
