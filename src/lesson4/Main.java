package lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // khai bao mang
        int[] a = new int[10];
        String mang[] = new String[10];
        double[] c = {1,2,4,5,6,2,2.1};

        System.out.println("Do dai cau mang " + mang.length);

        mang[0] = "a";
        mang[1] = "b";
        mang[2] = "c";

        System.out.println(mang[1]);
        System.out.println(mang[3]);
//        System.out.println(mang[20]);
        //Cach xu ly mang
        //for
        for (int i = 0; i < mang.length; i++) {
            String duLieuMang = mang[i];
            System.out.println(duLieuMang);
        }
        Scanner sc = new Scanner(System.in);
        String duLieuMang = "";
        //Nhap cac so vao trong mang
        for (int i = 0; i < mang.length; i++) {
            System.out.println("Nhap vao phan tu co index : " + i);
            duLieuMang = sc.nextLine();

            //gan du lieu vao mang
            mang[i] = duLieuMang;
        }
    }


}
