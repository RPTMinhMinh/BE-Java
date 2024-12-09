package lesson3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int n, giaiThua = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao n:");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            giaiThua = giaiThua * (n - i);
        }
        System.out.println("Giai thua giai: " + giaiThua);
    }
}
