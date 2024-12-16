package lesson8.QLNS;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Manager extends Employee{
    //khởi tạo mặc định cho list
    private List<Staff> staffList = new Vector<>();

    public Manager() {
        super();
        setEmployeeSalaryInDay(200d);
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }

    @Override
    public void input(){
        System.out.println("---Enter manager information---");
        super.input();
    }

    @Override
    public void output() {
        System.out.println("---Show manager information---");
        super.output();
    }

    @Override
    public double salaryMonthCalculation() {
        return getEmployeeSalaryInDay() * getEmployeeWorkInMonth() + (100 + staffList.size());
    }
}
