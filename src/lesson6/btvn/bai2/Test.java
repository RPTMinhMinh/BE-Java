package lesson6.btvn.bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dft = new SimpleDateFormat("dd/MM/yyyy");
        Account account = new Account(1122, 20000, 4.5,dft.parse("07/12/2003"));

        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("So du hien tai: " + account.getBalance());
        System.out.println("Tien lai hang thang: " + account.getAnnualInterestRate());

        System.out.println("Ngay tao: " + account.getDateCreated());
        System.out.println();
    }
}
