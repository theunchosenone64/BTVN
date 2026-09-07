package nguyennhathuy_5372.Lec07_Strings;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("Enter word to censor: ");
        String word = scanner.nextLine();
        String stars = "";
        for (int i = 0; i < word.length(); i++) {
            stars += "*";
        }
        String censored = sentence.replace(word, stars);
        System.out.println("Censored: " + censored);
    }
}
