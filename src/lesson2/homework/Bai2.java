package lesson2.homework;

import java.util.Scanner;

public class Bai2 {
    public static void kiemTraLoaiTamGiac() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap canh b: ");
        double b = sc.nextDouble();
        System.out.println("Nhap canh c: ");
        double c = sc.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && a == c && b == c) {
                System.out.println("Tam giac deu");
            } else if (a == b || b == c || c == a) {
                System.out.println("Tam giac can");
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("Tam giac vuong");
            } else if (a * a + b * b < c * c || a * a + c * c < b * b || b * b + c * c < a * a) {
                System.out.println("Tam giac tu");
            }else {
                System.out.println("Tam giac nhon");
            }
        }else {
            System.out.println("Khong phai tam giac");
        }
    }
}
