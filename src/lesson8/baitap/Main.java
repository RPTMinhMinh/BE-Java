package lesson8.baitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        int type = 0;
        do {
            System.out.println("Nhập các chức năng: ");
            System.out.println("1: Nhap thong tin cong ty");
            System.out.println("2: Phân bổ nhân viên vào trưởng phòng");
            System.out.println("3: Thêm, một nhân sự");
            System.out.println("4: xóa thông tin mot nhat su");
            System.out.println("5: Hien thi danh sach nhan vien");
            System.out.println("6: Xuất tổng lương cho toàn công ty");
            System.out.println("7: Nhân viên thường có lương cao nhất");
            System.out.println("8: Trưởng phòng có số lượng nhân viên dưới quyền nhiều nhất");
            System.out.println("9: Sắp xếp nhân viên toàn công ty theo thứ tự ABC (theo tên)");
            System.out.println("10: Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần");
            System.out.println("11: Tìm giám đốc có số lượng cổ phần nhiều nhất");
            System.out.println("12: xuất tổng thu nhập của từng giám đốc");
            System.out.println("13: Thoat");
            type = new Scanner(System.in).nextInt();
            switch (type) {
                case 1:
                    company.nhapThongTinCongTy();
                    break;
                case 2:
                    company.phanBoNhanVienVaoPhong();
                    break;
                case 3:
                    company.themNhaSu();
                    break;
                case 4:
                    company.xoaNhanVien();
                    break;
                case 5:
                    company.hienThiToanBoNhanVien();
                    break;
                case 6:
                    company.tongLuongNhanVien();
                    break;
                case 7:
                    company.nhanVienCoLuongCaoNhat();
                    break;
                case 8:
                    company.truongPhongCoNVMax();
                    break;
                case 9:
                    System.out.println("chua pt");
                    break;
                case 10:
                    company.luongGiamDan();
                    break;
                case 11:
                    company.giamDocCoCoPhanMax();
                    break;
                case 12:
                    System.out.println("chua pt");
                    break;
                case 13:
                    System.out.println("Thoat");
                    break;
            }
        } while (type != 13);
    }
}