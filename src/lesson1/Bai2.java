package lesson1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        Double a = sc.nextDouble();
        System.out.println("Enter number b: ");
        Double b = sc.nextDouble();
        System.out.println("Tong: " + (a + b));
        System.out.println("Tru: " + (a - b));
        System.out.println("Tich: " + (a * b));
        System.out.println("Thuong: " + (a / b));
        System.out.println("Thuong: " + (a % b));
    }
}
