package lesson2.homework;

import java.util.Scanner;

public class Bai1 {
    public static void tinhDiemSinhVien() {
        double diemChuyenCan, diemGiuaKi, diemCuoiKi;
        double diemTrungBinh;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem chuyen can: ");
        diemChuyenCan = sc.nextDouble();
        System.out.println("Nhap diem giua ki: ");
        diemGiuaKi = sc.nextDouble();
        System.out.println("Nhap diem cuoi ki: ");
        diemCuoiKi = sc.nextDouble();
        diemTrungBinh = ( diemChuyenCan + diemGiuaKi + diemCuoiKi ) / 3;
        if(diemTrungBinh >= 9){
            System.out.println("Loai A voi diem trung binh la: " + diemTrungBinh);
        } else if (diemTrungBinh < 9 && diemTrungBinh >= 7) {
            System.out.println("Loai B voi diem trung la: " + diemTrungBinh);
        } else if (diemTrungBinh < 7 && diemTrungBinh >= 5) {
            System.out.println("Loai C voi diem trung la: " + diemTrungBinh);
        } else {
            System.out.println("Loai D voi diem trung la: " + diemTrungBinh);
        }
    }
}
