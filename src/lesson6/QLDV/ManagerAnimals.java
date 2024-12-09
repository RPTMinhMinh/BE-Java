package lesson6.QLDV;

import java.util.Scanner;

public class ManagerAnimals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int choice;
        do {
            System.out.println("1. Tao danh sach cac dong vat");
            System.out.println("2. them cac dong vat");
            System.out.println("3. Them Monkey");
            System.out.println("0. dung ctr");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    n = taoMang(sc);
                    break;
                case 2:
                    themDongVat(n);
                    break;
            }
        } while (choice != 0);
    }

    private static int taoMang(Scanner sc) {
        System.out.println("Enter the number of the animal: ");
        int number = sc.nextInt();
        return number;
    }

    private static void themDongVat(int n){
        Animal[] animals = new Animal[n];
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1. Them Lion");
            System.out.println("2. Them Monkey");
            System.out.println("3. Them elephant");
            System.out.println("4. dung ctr");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    nhapTenTuoi(sc);
                    Animal[] lion = animals;
                    System.out.println(animals.toString());
                    break;
            }
        }while (choice != 4);
    }

    private static void nhapTenTuoi(Scanner sc) {
        System.out.println("Nhap ten");
        String name = sc.next();
        System.out.println("Nhap tuoi");
        int age = sc.nextInt();
    }

}

/*
Bài tập 1: Áp dụng tính kế thừa, trừu tượng, và đa hình

Đề bài:

Phát triển chương trình quản lý động vật trong sở thú từ bài tập trong buổi học:

1. Thêm một phương thức action() trong lớp trừu tượng Animal.

• Phương thức này sẽ được ghi đè ở từng lớp con để mô tả hành động đặc trưng của mỗi loại động vật:

o Lion: in ra “The lion is hunting.”

o Elephant: in ra “The elephant is spraying water.”

o Monkey: in ra “The monkey is climbing trees.”

2. Thêm phương thức showInfo() để hiện thị thông tin chi tiết của mỗi con vật gồm tên, tuổi

3. Tạo class ManagerAnimal cho phép thực hiện các yêu cầu:

a) có 1 danh sách các động vậy Lion,Elephant,Monkey, cho phép người dùng nhập vào n, chính là tổng số lượng các động vật mà sở thú quản lý

b) nhập vào danh sách các động vật của sở thú và cho phép người dùng lựa chọn

1. nhập vào Lion

2. nhập vào Elephant

3. nhập vào Monkey

4. Dừng nhập vào

 chú ý: nhập vào là bao gồm cả các thông tin tên, tuổi

c) Hiển thị danh sách tất cả các động vật trong sở thú

d) Thêm 1 con vật nếu danh sách đầy, phải mở rộng danh sách, mặc định mở rộng 10 phần tử

e) Cho phép nhập tên con vật, hiển thị thông tin con vật nếu có, không phân biệt hoa thường

f) Cho phép xóa con vật theo tên
 */
