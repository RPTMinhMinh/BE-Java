package testModule1;

import java.util.Scanner;

public class StudentManager {
    private Student[] students;
    private int currentStudentIndex;
    private int totalStudent;
    private final int DEFAULT_NEW_SIZE = 10;

    public StudentManager(int totalStudent) {
        this.totalStudent = totalStudent;
        students = new Student[this.totalStudent];
    }

    public Student[] copyArray(int newSize, Student[] oldArray) {
        Student[] newArray = new Student[newSize];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }

    public void reSizeArrayStudent() {
        if (currentStudentIndex == totalStudent) {
            this.totalStudent = this.totalStudent + DEFAULT_NEW_SIZE;
            this.students = copyArray(totalStudent, this.students);
        }
    }

    public void addStudent() {
        Student student = new Student();
        student.input();
        for (int i = 0; i < currentStudentIndex; i++) {
            if (students[i].getCode().equals(student.getCode())) {
                System.out.println("Mã sinh viên đã tồn tại, không thể thêm sinh viên.");
                return;
            }
        }
        reSizeArrayStudent();
        students[currentStudentIndex] = student;
        currentStudentIndex++;
        System.out.println("Sinh viên thu " + currentStudentIndex + " đã được thêm vào danh sách.");
    }

    public void showStudent() {
        if (currentStudentIndex == 0) {
            System.out.println("Danh sách sinh viên hiện đang trống.");
            return;
        }
        for (int i = 0; i < currentStudentIndex; i++) {
            if (students[i] == null) {
                continue;
            }
            System.out.println("-------- Sinh Vien: " + (i + 1) + " --------");
            students[i].output();
        }
    }

    public void searchStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên cần tìm: ");
        String keyword = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < currentStudentIndex; i++) {
            if (keyword.equalsIgnoreCase(students[i].getName())) {
                System.out.println("Kết quả tìm kiếm:  ");
                students[i].output();
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy sinh viên nào có tên " + keyword);
        }
    }

    public void deleteStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên cần xóa: ");
        String keyword = sc.nextLine();
        for (int i = 0; i < currentStudentIndex; i++) {
            if (!keyword.equalsIgnoreCase(students[i].getCode())) {
                System.out.println("Không tìm thấy sinh viên với mã " + keyword);
                return;
            }
            for (int j = i; j < currentStudentIndex; j++) {
                if (j == currentStudentIndex - 1) {
                    students[j] = null;
                    System.out.println("Sinh viên đã được xóa khỏi danh sách.");
                } else {
                    students[j] = students[j + 1];
                }
            }
            currentStudentIndex--;
        }
    }

    public void updateStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên cần sửa: ");
        String keyword = sc.nextLine();
        boolean check = false;
        String newCode, newName;
        int newAge;
        for (int i = 0; i < currentStudentIndex; i++) {
            if (keyword.equalsIgnoreCase(students[i].getCode())) {
                System.out.println("Thông tin sinh viên hiện tại:  ");
                students[i].output();
                check = true;
                System.out.println("Nhập mã sinh viên chỉnh sửa: ");
                newCode = sc.nextLine();
                students[i].setCode(newCode);
                System.out.println("Nhập tên sinh viên chỉnh sửa: ");
                newName = sc.nextLine();
                students[i].setName(newName);
                System.out.println("Nhập tuổi sinh viên chỉnh sửa: ");
                newAge = sc.nextInt();
                students[i].setAge(newAge);
                System.out.println("Thông tin sinh viên đã được cập nhật.");
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy sinh viên với mã " + keyword);
        }
    }
}
