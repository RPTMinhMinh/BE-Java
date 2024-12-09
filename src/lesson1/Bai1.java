package lesson1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap ngay/thang/nam");
        String date = sc.nextLine();
        System.out.println("Nhap que quan: ");
        String country = sc.nextLine();
        System.out.println("Nhap truong hoc: ");
        String uni = sc.nextLine();
        System.out.println("Xin chao " + name + " den tu " + country + ", sinh ngay " + date + ", hoc tai truong " + uni);
    }
}
