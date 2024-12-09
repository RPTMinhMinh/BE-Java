package lesson2.homework;

import java.util.Scanner;

public class Bai3 {
    public static void tinhTienDien() {
        double soDienSuDung, tienDien;
        final double bac1 = 1.678;
        final double bac2 = 1.734;
        final double bac3 = 2.014;
        final double bac4 = 2.536;
        final double bac5 = 2.834;
        final double bac6 = 2.927;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so dien su dung: ");
        soDienSuDung = sc.nextDouble();
        if (soDienSuDung > 0){
            if(soDienSuDung <= 50){
                tienDien = soDienSuDung * bac1;
                System.out.println("Tien dien: " + tienDien);
            } else if (soDienSuDung > 50 && soDienSuDung <= 100) {
                tienDien = 50 * bac1 + (soDienSuDung - 50) * bac2;
                System.out.println("Tien dien: " + tienDien);
            } else if (soDienSuDung > 100 && soDienSuDung <= 200) {
                tienDien = 50 * bac1 + 50 * bac2 + (soDienSuDung - 100) * bac3;
                System.out.println("Tien dien: " + tienDien);
            } else if (soDienSuDung > 200 && soDienSuDung <= 300) {
                tienDien = 50 * bac1 + 50 * bac2 + 100 * bac3 + (soDienSuDung - 200) * bac4;
                System.out.println("Tien dien: " + tienDien);
            } else if (soDienSuDung > 300 && soDienSuDung <= 400) {
                tienDien = 50 * bac1 + 50 * bac2 + 100 * bac3 + 100 * bac4 + (soDienSuDung - 300) * bac5;
                System.out.println("Tien dien: " + tienDien);
            } else {
                tienDien = 50 * bac1 + 50 * bac2 + 100 * bac3 + 100 * bac4 + (soDienSuDung - 400) * bac6;
                System.out.println("Tien dien: " + tienDien);
            }
        }else {
            System.out.println("So dien phai > 0");
        }
    }
}
