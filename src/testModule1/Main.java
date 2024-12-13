package testModule1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager studentManager = new StudentManager(0);
        int choice;
        do {
            System.out.println("1. Thêm sinh viên vào danh sách.");
            System.out.println("2. Sửa thông tin sinh viên.");
            System.out.println("3. Xóa sinh viên khỏi danh sách.");
            System.out.println("4. Tìm kiếm sinh viên theo tên.");
            System.out.println("5. Hiển thị danh sách sinh viên.");
            System.out.println("6. Thoát.");
            System.out.println("Chọn chức năng: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    studentManager.addStudent();
                    break;
                case 2:
                    studentManager.updateStudent();
                    break;
                case 3:
                    studentManager.deleteStudent();
                    break;
                case 4:
                    studentManager.searchStudent();
                    break;
                case 5:
                    studentManager.showStudent();
                    break;
                case 6:
                    System.out.println("Đã thoát khỏi chương trình.");
                    break;
                default:
                    System.out.println("Giá trị khum hợp lệ");
            }
        } while (choice != 6);
    }
}
