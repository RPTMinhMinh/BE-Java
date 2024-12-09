package lesson2.homework;

import java.util.Scanner;

import static lesson2.homework.Bai1.tinhDiemSinhVien;
import static lesson2.homework.Bai2.kiemTraLoaiTamGiac;
import static lesson2.homework.Bai3.tinhTienDien;

public class Bai4 {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Tinh diem sinh vien");
            System.out.println("2. Kiem tra tam giac");
            System.out.println("3. Tinh tien dien");
            System.out.println("4. Ket thuc!");
            System.out.println("Enter choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    tinhDiemSinhVien();
                    break;
                case 2:
                    kiemTraLoaiTamGiac();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("Ket thuc!");
                    break;
            }
        } while (choice != 4);
    }
}
