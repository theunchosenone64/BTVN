package nguyennhathuy_5372.Lec07_Strings;

import java.util.Scanner;

public class Ex1 {

    public static String trimText(String text) {
        return text.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line: ");
        String text = scanner.nextLine();
        String trimmed = trimText(text);
        System.out.println("Original: [" + text + "]");
        System.out.println("Trimmed: [" + trimmed + "]");
        System.out.println("Upper: " + text.toUpperCase());
        System.out.println("Lower: " + text.toLowerCase());
        System.out.println("Original length = " + text.length());
        System.out.println("Length after trimmed = " + trimmed.length());
    }

}
