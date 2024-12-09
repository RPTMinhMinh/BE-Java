package lesson3;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        double sum = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap vao n: ");
            n = sc.nextInt();
        }while (n < 0);
        for (int i = 1; i <= n; i++) {
            sum = sum + (i * i * i);
        }
        System.out.println("Tong: " +sum);
    }
}
