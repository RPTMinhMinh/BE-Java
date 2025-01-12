package testModule2.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private Employee employeeInCharge;
    private List<Transaction> transactions;

    public Account(String accountNumber, String accountHolder, double balance, Employee employeeInCharge) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.employeeInCharge = employeeInCharge;
        this.transactions = new ArrayList<>();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Employee getEmployeeInCharge() {
        return employeeInCharge;
    }

    public void setEmployeeInCharge(Employee employeeInCharge) {
        this.employeeInCharge = employeeInCharge;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println(this.accountHolder + " deposit amount: +" + amount);
        Transaction transaction = new Transaction("Deposit",this,employeeInCharge,"deposit",amount);
        addTransaction(transaction);
    }

    public void withdraw(double amount) {
        try{
            if(amount <= this.balance){
                this.balance -= amount;
                System.out.println(this.accountHolder + " withdraw amount: -" + amount);
                Transaction transaction = new Transaction("Withdraw",this,employeeInCharge,"withdraw",amount);
                addTransaction(transaction);
            }
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException("Ko du tien de rut");
        }
    }

    public void addTransaction(Transaction transaction) {
        if (!transactions.contains(transaction)){
            transactions.add(transaction);
        }
    }

}
