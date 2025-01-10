package testModule2.model;

import java.util.Scanner;

public class BankManagement {
    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement();
        AccountManagement accountManagement = new AccountManagement(employeeManagement);
        employeeManagement.addSampleEmployees();
        int choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Danh Sách Chức Năng");
            System.out.println("1.Quản lý tài khoản");
            System.out.println("2.Giao dịch tài khoản");
            System.out.println("3.Quản lý giao dịch");
            System.out.println("4.Quản lý nhân viên");
            System.out.println("5.Thoát chương trình");
            System.out.println("Nhap lua chon: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    accountManagement.quanLyTaiKhoan();
                    break;
                case 2:
                    accountManagement.giaoDichTaiKhoan();
                    break;
                case 3:
                    accountManagement.quanLyGiaoDich();
                    break;
                case 4:
                    employeeManagement.employeeManagerCase();
                    break;
                case 5:
                    System.out.println("Thoát khỏi hệ thống");
                    break;
            }
        }while (choice != 5);
    }
}
