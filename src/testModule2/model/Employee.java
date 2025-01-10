package testModule2.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String id;
    private String name;
    private double salary;
    private List<Account> managedAccounts;

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.managedAccounts = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Account> getManagedAccounts() {
        return managedAccounts;
    }

    public void setManagedAccounts(List<Account> managedAccounts) {
        this.managedAccounts = managedAccounts;
    }

    public void addAccount(Account account){
        if(!managedAccounts.contains(account)){
            managedAccounts.add(account);
            account.setEmployeeInCharge(this);
        }
    }
    public void processTransaction(Transaction transaction){
    }


}
