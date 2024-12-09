package lesson6.btvn.bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class Bai3 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dft = new SimpleDateFormat("dd/MM/yyyy");
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100, 0, dft.parse("07/12/2003"));
        }
        int choice;
        do {
            System.out.println("nhap id (0-9):");
            int id = sc.nextInt();
            while (id < 0 || id > 9) {
                id = sc.nextInt();
            }
            System.out.println("1.Xem số dư hiện tại");
            System.out.println("2.Rút tiền");
            System.out.println("3.Gửi tiền");
            System.out.println("4.Thoát");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("So du hien tai: " + accounts[id].getBalance());
                    break;
                case 2:
                    System.out.println("Nhap so tien can rut");
                    double tienCanRut = sc.nextDouble();
                    accounts[id].withdraw(tienCanRut);
                    break;
                case 3:
                    System.out.println("Nhap so tien can gui:");
                    double tienCanGui = sc.nextDouble();
                    accounts[id].deposit(tienCanGui);
                    break;
                case 4:
                    System.out.println("Thoat!");
                    break;
            }
        } while (choice != 4);
    }
}
