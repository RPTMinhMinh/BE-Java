package lesson6.btvn.bai2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
    }

    public Account(int id, double balance, double annualInterestRate, Date dateCreated) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getDateCreated() {
        SimpleDateFormat dft = new SimpleDateFormat("dd/MM/yyyy");
        return dft.format(dateCreated);
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 100 / 12;

    }
    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double tienCanRut){
        if(tienCanRut <= balance){
            balance = balance - tienCanRut;
            System.out.println("Rut tien: " + tienCanRut);
        }else {
            System.out.println("Khong du so du");
        }
    }

    public void deposit(double tienChoVao){
        balance += tienChoVao;
        System.out.println("Nap tien: " + tienChoVao);
    }
}
