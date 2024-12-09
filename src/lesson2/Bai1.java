package lesson2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        float soGioLamViec;
        float luong;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so gio lam viec: ");
        soGioLamViec = sc.nextFloat();
        if(soGioLamViec > 40){
            luong = (float) (soGioLamViec * 50000 * 1.5);
            System.out.println("Luong:  " + luong);
        }else {
            luong = soGioLamViec * 50000;
            System.out.println("Luong:  " + luong);
        }
    }
}
