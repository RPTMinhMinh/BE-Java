package lesson9.QLSV;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager();
        int choice;
        do {
            System.out.println("---------System-----------");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Hiển thị danh sách sinh viên");
            System.out.println("4. Tìm kiếm sinh viên theo tên");
            System.out.println("5. Sắp xếp danh sách sinh viên theo điểm thi");
            System.out.println("6. Kiểm tra sinh viên có tồn tại không");
            System.out.println("7. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sm.addStudent();
                    break;
                case 2:
                    sm.removeStudent();
                    break;
                case 3:
                    sm.showStudent();
                    break;
                case 4:
                    sm.searchStudentByName();
                    break;
                case 5:
                    sm.sortStudentsByScore();
                    break;
                case 6:
                    sm.searchStudentByCode();
                    break;
                case 7:
                    System.out.println("End of program");
                    break;
            }
        } while (choice != 7);
    }
}
