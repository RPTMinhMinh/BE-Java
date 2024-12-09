package lesson5;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter phone number: ");
        String phone = sc.nextLine();
        boolean check = checkPhoneNumber(phone);
        if(check == true){
            System.out.println("Phone number is valid");
        }else {
            System.out.println("Phone number is not valid");
        }

    }
/*
+84987654321
0987654321
84987654321
0987-654-321
 */
    public static boolean checkPhoneNumber(String phone) {
        String deleteUnknowncharacter = phone.replace("+","").replace("-","").replace(".","");
        if (deleteUnknowncharacter.length() > 11 || deleteUnknowncharacter.length() < 10) {
            return false;
        }
        char firstChar = deleteUnknowncharacter.charAt(0);
        if (firstChar != '0' && firstChar != '8' ) {
            return false;
        }
        return true;
    }
}
