package lesson3.homework;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int num, soNhiPhan = 0, du = 0, i = 1, a = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        num = sc.nextInt();
        while (num > 0) {
            du = num % 2;
            soNhiPhan = soNhiPhan + (du * i);
            i = i * 10;
            num = num / 2;
        }
        System.out.println("Nhi Phan: " + soNhiPhan);
    }
}
