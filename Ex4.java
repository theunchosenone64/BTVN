package nguyennhathuy_5372.Lec07_Strings;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID, for example SE123456: ");
        String studentId = scanner.nextLine();

        String majorCode = studentId.substring(0, 2);
        String numericPart = studentId.substring(2);

        System.out.println("Major code = " + majorCode);
        System.out.println("Numeric part = " + numericPart);

    }
}
