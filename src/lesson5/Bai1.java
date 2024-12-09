package lesson5;

public class Bai1 {
    public static void main(String[] args) {
        String str = "Tôi học lập trình, học lập trình trình rất hay";
        demSoTu(str);
    }

    public static void xoaKyTuDacBiet(String[] arrStr) {
        for (int i = 0; i < arrStr.length; i++) {
            String str = arrStr[i].replace(",", "").replace(":", "").replace(":", "").trim();
            arrStr[i] = str;
        }
    }

    public static void demSoTu(String str) {
        String[] arrStr = str.split(" ");
        xoaKyTuDacBiet(arrStr);

        int soDong = arrStr.length;
        int soCot = 2;
        int soLuongDongThucTe = 0;
        String[][] mang2Chieu = new String[soDong][soCot];
        for (int i = 0; i < arrStr.length; i++) {
            boolean boQuaKyTu = false;
            String kyTuCanKiemTra = arrStr[i];

            for (int j = 0; j < i; j++) {
                if (arrStr[j].equalsIgnoreCase(arrStr[i])) {
                    boQuaKyTu = true;
                    break;
                }
            }

            if (boQuaKyTu) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < arrStr.length; j++) {
                if (kyTuCanKiemTra.equalsIgnoreCase(arrStr[j])) {
                    count++;
                }
            }
            mang2Chieu[soLuongDongThucTe][0] = kyTuCanKiemTra;
            mang2Chieu[soLuongDongThucTe][1] = String.valueOf(count);
            soLuongDongThucTe++;
        }
        hienThi(mang2Chieu, soLuongDongThucTe);
    }

    public static void hienThi (String[][] arrStr, int soLuongDongThucTe) {
        for (int i = 0; i < soLuongDongThucTe; i++){
            for (int j = 0; j < arrStr[i].length; j++) {
                String data = arrStr[i][j];
                if (j == 0){
                    data = data.substring(0, 1).toUpperCase() + data.substring(1);
                    System.out.print(data + " : ");
                    continue;
                }
                System.out.print(arrStr[i][j] + " tu ");
            }
            System.out.println("");
        }
    }
}
