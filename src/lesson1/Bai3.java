package lesson1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width: ");
        int width = sc.nextInt();
        System.out.println("Enter height: ");
        int height = sc.nextInt();
        System.out.println("S = " + (width * height));
    }
}
