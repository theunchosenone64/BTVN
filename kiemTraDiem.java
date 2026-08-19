package nguyennhathuy_5372.Lec04_Condition;

import java.util.Scanner;

public class kiemTraDiem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap diem: ");
        double diem = scanner.nextDouble();

        if (diem >= 5.0) {
            System.out.println("Dat");
        } else {
            System.out.println("Khong dat");
        }
    }
}
