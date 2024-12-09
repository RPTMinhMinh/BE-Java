package lesson4.homework;

public class Bai1 {
    public static void main(String[] args) {
        String text = "Ngôn ngữ lập trình Java ban đầu được phát triển bởi Sun Microsystems do James Gosling khởi xướng và phát hành vào năm 1995. Phiên bản mới nhất của Java Standard Edition là Java SE 8. Với sự tiến bộ của Java và sự phổ biến rộng rãi của nó, nhiều cấu hình đã được xây dựng để phù hợp với nhiều loại nền tảng khác nhau.";
        demTu(text);
        System.out.println("-----------------------------------");
        vietHoaChuDau(text);
        System.out.println("-----------------------------------");
        xoaNguyenAm(text);
    }

    public static void demTu(String text){
        String[] words = text.replace(",","").replace(".","").toUpperCase().split(" ");
        String[] cacTuDuyNhat = new String[words.length];
        int[] count = new int[words.length];
        int demSoTuDuyNhat = 0;
        for (int i = 0; i < words.length; i++) {
            boolean timThay = false;
            for (int j = 0; j < demSoTuDuyNhat; j++) {
                if (cacTuDuyNhat[j].equals(words[i])){
                    count[j]++;
                    timThay = true;
                    break;
                }
            }
            if (!timThay){
                cacTuDuyNhat[demSoTuDuyNhat] = words[i];
                count[demSoTuDuyNhat] = 1;
                demSoTuDuyNhat++;
            }
        }
        for (int i = 0; i < demSoTuDuyNhat; i++) {
            System.out.println(cacTuDuyNhat[i] + " : " + count[i] + " tu");
        }
    }

    public static void vietHoaChuDau(String text) {
        String[] words = text.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String word = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1) + " ";
            result = result.concat(word);
        }
        System.out.println(result);
    }

    public static void xoaNguyenAm(String text) {
        String nguyenAm = "ueoaiAEIOUY";
        String ketQua = "";
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (char ch : words[i].toCharArray()) {
                if (nguyenAm.indexOf(ch) == -1) {
                    ketQua += ch;
                }
            }
            ketQua = ketQua.concat(" ");
        }
        System.out.println(ketQua);
    }
}

