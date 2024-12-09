package lesson4.homework;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter phone number: ");
        String phone = sc.nextLine();
        if(checkPhoneNumber(phone)){
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
        String[] phoneNumbers = phone.replace("+","").replace("-","").replace(".","").split("");
        if(phoneNumbers.length == 10 && phoneNumbers[0].equals("0")) {
            return true;
        }

        if(phoneNumbers.length == 11 && phoneNumbers[0].equals("8") && phoneNumbers[1].equals("4")) {
            return true;
        }
        return false;
    }
}
