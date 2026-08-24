package nguyennhathuy_5372.Lec05_Loops;

import java.util.Random;
import java.util.Scanner;

public class RandomAddGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int wrongCount = 0;

        while (wrongCount < 3) {
            int numberOfTerms = random.nextInt(4) + 2;
            int correctSum = 0;

            for (int i = 0; i < numberOfTerms; i++) {
                int term = random.nextInt(10) + 1;
                correctSum += term;
                System.out.print(term + (i < numberOfTerms - 1 ? " + " : " = "));
            }

            int answer = scanner.nextInt();
            if (answer == correctSum) {
                score++;
                System.out.println("Correct! Score: " + score);
            } else {
                wrongCount++;
                System.out.println("Wrong! Answer: " + correctSum + " | Wrong: " + wrongCount + "/3");
            }
        }

        System.out.println("Game Over! Total score: " + score);
    }
}
