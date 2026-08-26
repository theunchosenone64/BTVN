package nguyennhathuy_5372.Lec06_Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ReadDisplayArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Array: " + Arrays.toString(a));
    }
}
