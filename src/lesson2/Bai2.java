package lesson2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int a, b, c;
        double delta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        b = sc.nextInt();
        System.out.println("Nhap c: ");
        c = sc.nextInt();
        delta = (b * b) - (4 * a * c);
        if (a == 0){
            if(b == 0){
                if(c == 0){
                    System.out.println("Phương trình có vô số nghiệm");
                }else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            }else {
                System.out.println("Phuong trinh co nghiem");
            }
        }
    }
}
