package lesson3.homework;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so ( cach nhau boi 1 khoang trang ): ");
        String[] input = sc.nextLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            int n = Integer.parseInt(input[i]);
            System.out.println("So " + n);
            if (soHoanHao(n)) {
                System.out.println("La so hoan hao");
            } else {
                System.out.println("Khong phai la so hoan hao");
            }
            if (soArmstrong(n)) {
                System.out.println("La so armstrong");
            } else {
                System.out.println("Khong phai la so armstrong");
            }
            if (soDoiXung(n)) {
                System.out.println("La so doi xung");
            } else {
                System.out.println("Khong phai la so doi xung");
            }
            System.out.println("Tong cac chu so la: " + tongCacChuSo(n));
        }
    }

    public static boolean soHoanHao(int n) {
        int tong = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }
        return tong == n;
    }

    public static boolean soArmstrong(int n) {
        int sum = 0;
        int count = 0;
        int du;
        int prev_n = n;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        n = prev_n;
        while (n != 0) {
            du = n % 10;
            sum += Math.pow(du, count);
            n = n / 10;
        }
        return sum == prev_n;
    }

    public static boolean soDoiXung(int n) {
        int ketQua = 0;
        int prev_n = n;
        while (n != 0) {
            int du = n % 10;
            ketQua = ketQua * 10 + du;
            n /= 10;
        }
        return prev_n == ketQua;
    }

    public static int tongCacChuSo(int n) {
        int sum = 0;
        int du;
        while (n != 0) {
            du = n % 10;
            sum = sum + du;
            n /= 10;
        }
        return sum;
    }
}
