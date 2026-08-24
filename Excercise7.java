package nguyennhathuy_5372.Lec05_Loops;

import java.util.Scanner;

public class Excercise7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x, sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Nhap so thuc: ");
            x = scanner.nextDouble();

            if (x == 0) {
                break;
            }

            sum += x;
            count++;
        }

        if (count == 0) {
            System.out.println("Chua co du lieu.");
        } else {
            double average = sum / count;

            System.out.println("Tong = " + sum);
            System.out.println("So luong = " + count);
            System.out.println("Trung binh = " + average);
        }
    }
}
