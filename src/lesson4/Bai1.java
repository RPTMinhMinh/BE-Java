package lesson4;

import java.util.Scanner;

/**
 * bai 1:
 * cho nguoi dung nhap vao n so tu nhien
 * + n do người dùng nhập
 * + sau đó cho phép người dùng nhập vào n số tự nhiên
 * yếu cầu:
 * 1) Hiển thị các số người dùng nhập vào
 * 2) Tính tổng các số trong mảng
 * 3) Tìm số lớn nhất và nhỏ nhất trong mảng
 */
public class Bai1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        nhapMang(sc, arr);
        tinhTong(arr);
        timSoLonNhatNhoNhat(arr);
        sapXep(arr);
    }

    private static void sapXep(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sap xep theo thu tu giam dan: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    private static void timSoLonNhatNhoNhat(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max cua mang la: " + max);
        System.out.println("Min cua mang la: " + min);
    }

    private static void tinhTong(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Tong cac phan tu trong mang la: " + sum);
    }

    private static void nhapMang(Scanner sc, int[] arr) {
        int duLieuMang;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Number " + i + " : ");
            duLieuMang = sc.nextInt();
            arr[i] = duLieuMang;
        }
        System.out.println("Do dai cua mang la: " + arr.length);
    }
}
