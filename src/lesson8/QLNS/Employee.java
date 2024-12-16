package lesson8.QLNS;

import java.util.Scanner;

public abstract class Employee {
    private String employeeCode;
    private String employeeName;
    private String employeePhoneNumber;
    private Integer employeeWorkInMonth;
    private Double employeeSalaryInDay;

    public abstract double salaryMonthCalculation();

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }

    public void setEmployeePhoneNumber(String employeePhoneNumber) {
        this.employeePhoneNumber = employeePhoneNumber;
    }

    public Integer getEmployeeWorkInMonth() {
        return employeeWorkInMonth;
    }

    public void setEmployeeWorkInMonth(Integer employeeWorkInMonth) {
        this.employeeWorkInMonth = employeeWorkInMonth;
    }

    public Double getEmployeeSalaryInDay() {
        return employeeSalaryInDay;
    }

    public void setEmployeeSalaryInDay(Double employeeSalaryInDay) {
        this.employeeSalaryInDay = employeeSalaryInDay;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee code: ");
        employeeCode = sc.nextLine();
        System.out.println("Enter the employee name: ");
        employeeName = sc.nextLine();
        System.out.println("Enter the employee phone number: ");
        employeePhoneNumber = sc.nextLine();
        System.out.println("Enter the employee work in month: ");
        employeeWorkInMonth = sc.nextInt();
//        System.out.println("Enter the employee salary in day: ");
//        employeeSalaryInDay = sc.nextDouble();
    }
    public void output(){
        System.out.println("Employee Code: " + employeeCode);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Phone Number: " + employeePhoneNumber);
        System.out.println("Employee Work In Month: " + employeeWorkInMonth);
        System.out.println("Employee Salary In Day: " + employeeSalaryInDay);
    }
}
