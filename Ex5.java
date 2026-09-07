package nguyennhathuy_5372.Lec07_Strings;

import java.util.Scanner;

public class Ex5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String fileName = scanner.nextLine();
        System.out.println("Starts with report: " + fileName.startsWith("report"));
        System.out.println("Ends with .pdf: " + fileName.endsWith(".pdf"));
        System.out.println("First character = " + fileName.charAt(0));
        System.out.println("Last character = " + fileName.charAt(fileName.length() - 1));
    }
}
