package nguyennhathuy_5372.Lec06_Arrays;

import java.util.Scanner;

public class ArraySumAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            sum += a[i];
        }
        double average = (double) sum / n;
        
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
