package testModule2.model;

import java.util.*;

public class AccountManagement {
    private Map<String, Account> accounts;
    private EmployeeManagement employeeManagement;

    public AccountManagement(EmployeeManagement employeeManagement) {
        accounts = new HashMap<>();
        this.employeeManagement = employeeManagement;
    }


    public void quanLyTaiKhoan() {
        int choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("-----QUẢN LÝ TÀI KHOẢN-----");
            System.out.println("1.1. Thêm tài khoản mới.");
            System.out.println("1.2. Sửa thông tin tài khoản.");
            System.out.println("1.3. Xóa tài khoản.");
            System.out.println("1.4. Tìm kiếm tài khoản.");
            System.out.println("1.5. Xem danh sách tài khoản");
            System.out.println("1.6. Thoát");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addAccount();
                    break;
                case 2:
                    updateAccount();
                    break;
                case 3:
                    deleteAccount();
                    break;
                case 4:
                    searchAccount();
                    break;
                case 5:
                    showAccount();
                    break;
                case 6:
                    System.out.println("!!! Kết thúc quản lý tài khoản !!!");
                    break;
            }
        } while (choice != 6);
    }

    public void giaoDichTaiKhoan() {
        int choice;
        do {
            System.out.println("-----GIAO DỊCH TÀI KHOẢN-----");
            System.out.println("2.1. Nạp Tiền");
            System.out.println("2.2. Rút Tiền");
            System.out.println("2.3. Chuyển Khoản");
            System.out.println("2.4. Thoát");
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    depositMoney();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                case 3:
                    transferMoney();
                    break;
                case 4:
                    System.out.println("!!! Kết thúc giao dịch tài khoản !!!");
                    break;
            }
        } while (choice != 4);
    }

    public void quanLyGiaoDich() {
        int choice;
        do {
            System.out.println("-----QUẢN LÝ GIAO DỊCH-----");
            System.out.println("3.1. Hiển Thị Lịch Sử Giao Dịch Của Một Tài Khoản");
            System.out.println("3.2. Hiển Thị Toàn Bộ Giao Dịch Trong Hệ Thống");
            System.out.println("3.3. Thoát");
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    showTranferAccount();
                    break;
                case 2:
                    showAllTranferAccount();
                    break;
                case 3:
                    System.out.println("!!! Kết thúc quản lý giao dịch");
                    break;
            }
        } while (choice != 3);
    }

    public void addAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Số tài khoản: ");
        String accountNumber = sc.nextLine();
        System.out.println("Tên chủ tài khoản: ");
        String accountHolder = sc.nextLine();
        System.out.println("Số dư ban đầu: ");
        double balance = sc.nextInt();
        sc.nextLine();
        if (accounts.containsKey(accountNumber)) {
            System.out.println("Số tài khoản da tồn tại");
            return;
        }
        System.out.println("ID nhân viên phụ trách: ");
        String id = sc.nextLine();
        Employee employeeInCharge = employeeManagement.findEmployeeById(id);
        if (employeeInCharge == null) {
            System.out.println("Không tồn tại mã nhân viên");
        }

        Account account = new Account(accountNumber, accountHolder, balance, employeeInCharge);
//        employeeInCharge.addAccount(account);
        accounts.put(accountNumber, account);
        System.out.println("----------------------------------");
        System.out.println("Thêm tài khoản thành công");
        System.out.println("----------------------------------");
    }

    public void showAccount() {
        if (accounts.isEmpty()) {
            System.out.println("Không có tài khoản trong hệ thống");
            return;
        }
        System.out.println("Danh sách tài khoản: ");
        for (Account account : accounts.values()) {
            System.out.println("Account number: " + account.getAccountNumber());
            System.out.println("Account holder: " + account.getAccountHolder());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Employee in charge: " + (account.getEmployeeInCharge() == null ? "Chưa có nhân viên quản lý nào. Vui lòng thêm nhân viên trong mục Quản lý Nhân viên" : account.getEmployeeInCharge().getName()));
            System.out.println("-------------------");
        }
    }

    public void updateAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Số tài khoản cần sửa: ");
        String key = sc.nextLine();
        Account account = accounts.get(key);
        if (account == null) {
            System.out.println("Không tìm thấy số tài khoản: " + key);
            return;
        }
        System.out.println("Nhập tên tài khoản mới: ");
        String newAccountHolder = sc.nextLine();
        account.setAccountHolder(newAccountHolder);
        System.out.println("Nhập số dư tài khoản mới: ");
        double newBalance = sc.nextDouble();
        account.setBalance(newBalance);
        System.out.println("----------------------------------");
        System.out.println("Cập nhật tài khoản thành công");
        System.out.println("----------------------------------");
    }

    public void deleteAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tài khoản cần xóa: ");
        String key = sc.nextLine();
        Account account = accounts.get(key);
        if (account == null) {
            System.out.println("Không tìm thấy số tài khoản " + key);
            return;
        }
        if (account.getBalance() > 0) {
            System.out.println("Cần phải rút hết tiền trong tài khoản mới có thể xóa tài khoản được");
            return;
        }
        accounts.remove(key);
        System.out.println("----------------------------------");
        System.out.println("Xóa tài khoản thành công");
        System.out.println("----------------------------------");
    }

    public void searchAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tài khoản / tên tài khoản cần tìm kiếm: ");
        String key = sc.nextLine();
        for (Account ac : accounts.values()) {
            if (ac.getAccountNumber().equals(key) || ac.getAccountHolder().equalsIgnoreCase(key)) {
                System.out.println("Account number: " + ac.getAccountNumber());
                System.out.println("Account holder: " + ac.getAccountHolder());
                System.out.println("Balance: " + ac.getBalance());
                System.out.println("Employee in charge: " + ac.getEmployeeInCharge().getName());
            }
        }
    }

    public void depositMoney() {
        System.out.println("Nhập vào tài khoản muốn nạp tiền: ");
        String key = new Scanner(System.in).nextLine();
        Account account = accounts.get(key);
        if (account == null) {
            System.out.println("Không tìm thấy số tài khoản " + key);
        }
        System.out.println("Nhập số tiền cần nạp: ");
        double amout = new Scanner(System.in).nextDouble();
        if (amout <= 0) {
            System.out.println("Số tiền nạp phải > 0");
            return;
        }
        System.out.println("----------------------------------");
        account.deposit(amout);
        System.out.println("Nạp tiền thành công");
        System.out.println("Số dư tài khoản: " + account.getBalance());
        System.out.println("----------------------------------");

    }

    public void withdrawMoney() {
        System.out.println("Nhập vào tài khoản muốn rút tiền: ");
        String key = new Scanner(System.in).nextLine();
        Account account = accounts.get(key);
        if (account == null) {
            System.out.println("Không tìm thấy số tài khoản " + key);
            return;
        }
        System.out.println("Nhập số tiền cần rút: ");
        double amout = new Scanner(System.in).nextDouble();
        if (amout <= 0) {
            System.out.println("Số tiền rút phải > 0");
            return;
        }
        System.out.println("----------------------------------");
        account.withdraw(amout);
        System.out.println("Rút tiền thành công");
        System.out.println("Số dư tài khoản: " + account.getBalance());
        System.out.println("----------------------------------");
    }

    public void transferMoney() {
        System.out.println("Nhập vào số tài khoản muốn chuyển: ");
        String accountSend = new Scanner(System.in).nextLine();
        Account account1 = accounts.get(accountSend);
        System.out.println("Nhập vào số tài khoản muốn nhận: ");
        String accountGive = new Scanner(System.in).nextLine();
        Account account2 = accounts.get(accountGive);
        if (accountSend == null || accountGive == null) {
            System.out.println("Không tìm thấy số tài khoản" + (accountSend == null ? accountSend : accountGive));
            return;
        }
        System.out.println("Nhập vào số tiền cần chuyển: ");
        double amout = new Scanner(System.in).nextDouble();
        if (amout <= 0) {
            System.out.println("Số tiền cần chuyển phải > 0");
            return;
        }
        System.out.println("----------------------------------");
        account1.withdraw(amout);
        account2.deposit(amout);
        System.out.println("Gửi tiền thành công");
        System.out.println("----------------------------------");
    }

    public void showTranferAccount() {
        System.out.println("Nhập vào số tài khoản: ");
        String key = new Scanner(System.in).nextLine();
        Account account = accounts.get(key);
        if (account == null) {
            System.out.println("Không tìm thấy số tài khoản " + key);
            return;
        }
        List<Transaction> transactions = account.getTransactions();
        for (Transaction transaction : transactions) {
            System.out.println("Transaction id: " + transaction.getTransactionId());
            System.out.println("Account number: " + account.getAccountNumber());
            System.out.println("Account holder: " + account.getAccountHolder());
            System.out.println("Type: " + transaction.getType());
            System.out.println("Amount: " + (transaction.getType().equals("withdraw") ? "-" : "+") + transaction.getAmount());
            System.out.println("Time: " + transaction.getTimestamp());
            System.out.println("Employee: " + account.getEmployeeInCharge().getName());
            System.out.println("---------------------------");
        }
    }

    public void showAllTranferAccount() {
        for (Account account : accounts.values()) {
            for (Transaction transaction : account.getTransactions()) {
                System.out.println("Transaction id: " + transaction.getTransactionId());
                System.out.println("Account number: " + account.getAccountNumber());
                System.out.println("Account holder: " + account.getAccountHolder());
                System.out.println("Type: " + transaction.getType());
                System.out.println("Amount: " + (transaction.getType().equals("withdraw") ? "-" : "+") + transaction.getAmount());
                System.out.println("Time: " + transaction.getTimestamp());
                System.out.println("Employee: " + account.getEmployeeInCharge().getName());
                System.out.println("----------------------------");
            }
        }
    }
}
