package lesson8.QLNS;

public class Staff extends Employee {
    public Manager manager;

    public Staff() {
        super();
    }


    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public void input(){
        System.out.println("---Enter staff information---");
        super.input();
    }

    @Override
    public void output() {
        System.out.println("---Show staff information---");
        super.output();
    }

    @Override
    public double salaryMonthCalculation() {
        return getEmployeeSalaryInDay() * getEmployeeWorkInMonth();
    }
}
