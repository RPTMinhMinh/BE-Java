package lesson8.QLNS;

import java.util.List;
import java.util.Scanner;

public class Company {
    private String companyName;
    private String companyCode;
    private double salaryInMonth;

    private List<Employee> employeeList;

    public Company(String companyName, String companyCode, double salaryInMonth, List<Employee> employeeList) {
        this.companyName = companyName;
        this.companyCode = companyCode;
        this.salaryInMonth = salaryInMonth;
        this.employeeList = employeeList;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public double getSalaryInMonth() {
        return salaryInMonth;
    }

    public void setSalaryInMonth(double salaryInMonth) {
        this.salaryInMonth = salaryInMonth;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter company name: ");
        this.companyName = sc.nextLine();
        System.out.println("Enter company code: ");
        this.companyCode = sc.nextLine();
        System.out.println("Enter salary: ");
        this.salaryInMonth = sc.nextDouble();
    }

    public void output() {
        System.out.println("---List of employees---");
        for (Employee e : employeeList) {
            e.output();
        }
    }

    public void addEmployee() {
        System.out.println("---Add new employee to the list---");
        Employee employee = chooseTypeOfEmployee();
        if (employee == null) {
            return;
        }
        employeeList.add(employee);
    }

    private static Employee chooseTypeOfEmployee() {
        Employee employee = null;
        int choose = 0;
        System.out.println("Choose an option: ");
        System.out.println("1. Director");
        System.out.println("2. Manager");
        System.out.println("3. Employee");
        System.out.println("4. Exit");
        choose = new Scanner(System.in).nextInt();
        switch (choose) {
            case 1:
                employee = new Director();
                break;
            case 2:
                employee = new Manager();
                break;
            case 3:
                employee = new Staff();
                break;
            case 4:
                System.out.println("Exit application");
                break;
            default:
                System.out.println("Invalid choice");
                choose = 1;
                break;
        }
        return employee;
    }
}
