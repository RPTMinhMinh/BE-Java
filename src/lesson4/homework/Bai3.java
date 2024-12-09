package lesson4.homework;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap vao phan tu thu " + (i + 1) + " :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Cac phan tu trong mang: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        int choice;
        do {
            System.out.println("Chọn tác vụ: ");
            System.out.println("1. Tính tổng các phần tử chẵn và tổng các phần tử lẻ trong mảng.");
            System.out.println("2. Tìm và in ra các số nguyên tố có trong mảng.");
            System.out.println("0. Thoát chương trình.");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    yc1(arr);
                    break;
                case 2:
                    yc2(arr);
                    break;
                case 3:

                case 0:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                    break;
            }
        } while (choice != 0);
    }

    public static void yc1(int[] arr) {
        int tongChan = 0;
        int tongLe = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                tongChan += arr[i];
            } else {
                tongLe += arr[i];
            }
        }
        System.out.println("Tong chan: " + tongChan);
        System.out.println("Tong le: " + tongLe);
    }

    public static void yc2(int[] arr) {
        String ketQua = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 2) {
                for(int j = 2; j <= Math.sqrt(arr[i]); j++) {
                    if (arr[i] % j == 0) {
                        ketQua = ketQua + arr[i] + "  ";
                    }
                }
            }
        }
        System.out.println("Ket quan: " + ketQua);
    }
}


/*
Mô tả bài toán:
Bạn sẽ xây dựng một chương trình Java có thể thực hiện các tác vụ phức tạp sau:
1.Nhập một mảng các số nguyên.
2.Tính tổng các phần tử chẵn và tổng các phần tử lẻ trong mảng.
3.Tìm và in ra các số nguyên tố có trong mảng.
4.Sắp xếp mảng sao cho:
oCác phần tử chẵn được sắp xếp theo thứ tự giảm dần.
oCác phần tử lẻ được sắp xếp theo thứ tự tăng dần.
5.Chia mảng thành 2 mảng con:
oMảng 1: Chứa tất cả các phần tử có giá trị nhỏ hơn hoặc bằng trung bình của mảng.
oMảng 2: Chứa tất cả các phần tử có giá trị lớn hơn trung bình của mảng.
6.Tìm số lượng phần tử trùng lặp trong mảng và in ra các phần tử trùng lặp.
7.Thêm một phần tử vào mảng:
oCho phép người dùng thêm một phần tử vào mảng tại vị trí chỉ định (index).
oNếu mảng đã đầy, tự động mở rộng mảng.
8.Xoá một phần tử khỏi mảng:
oCho phép người dùng nhập vào một giá trị phần tử và xoá phần tử đó trong mảng.
Yêu cầu:
1.Nhập mảng: Bạn sẽ nhập một mảng các số nguyên từ bàn phím.
2.Tìm số nguyên tố: Viết một hàm để kiểm tra xem một số có phải là số nguyên tố hay không, sau đó tìm và in ra tất cả các số nguyên tố trong mảng.
3.Chia mảng thành hai mảng con:
oTính trung bình của mảng.
oDuyệt qua các phần tử và chia chúng thành 2 mảng con: một mảng chứa các phần tử nhỏ hơn hoặc bằng trung bình, mảng còn lại chứa các phần tử lớn hơn trung bình.
4.Thêm phần tử vào mảng: Bạn cần thêm một phần tử vào mảng tại chỉ định index. Nếu mảng đã đầy, mở rộng mảng tự động.
5.Xoá phần tử khỏi mảng: Xoá một phần tử trong mảng nếu phần tử đó tồn tại.

 */