package lesson3.homework;

public class Bai1 {
    public static void main(String[] args) {
        int tongTien = 200000;
        int menhGia1k = 1000;
        int menhGia2k = 2000;
        int menhGia5k = 5000;
        for(int soTo1k = 0; soTo1k <= tongTien / menhGia1k; soTo1k++){
            for(int soTo2k = 0; soTo2k <= (tongTien - menhGia1k * soTo1k)/menhGia2k; soTo2k++){
                int soTo5k = (tongTien - menhGia1k * soTo1k - menhGia2k * soTo2k)/menhGia5k;
                if(menhGia1k * soTo1k + menhGia2k * soTo2k + menhGia5k * soTo5k == tongTien){
                    System.out.println("So to 1000 can dung la: " + soTo1k);
                    System.out.println("So to 2000 can dung la: " + soTo2k);
                    System.out.println("So to 5000 can dung la: " + soTo5k);
                    System.out.println("-------------");
                }
            }
        }
    }
}
