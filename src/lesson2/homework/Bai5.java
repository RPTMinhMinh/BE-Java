package lesson2.homework;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap vao nam: ");
        a = in.nextInt();
        System.out.println("Nhap vao thang: ");
        b = in.nextInt();
        switch (b) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Thang " + b + " nam " + a + " co 31 ngay");
                break;
            case 4, 6, 9, 11:
                System.out.println("Thang " + b + " nam " + a + " co 30 ngay");
                break;
            case 2:
                if (a % 400 == 0 || a % 4 == 0 && a % 100 != 0) {
                    System.out.println("Thang " + b + " nam " + a + " co 29 ngay");
                } else {
                    System.out.println("Thang " + b + " nam " + a + " co 28 ngay");
                }
                break;
        }
    }
}
