package lesson8.QLNS;

import java.util.Scanner;

public class Director extends Employee{
    private Double share;

    public Director() {
        super();
        super.setEmployeeSalaryInDay(300d);
    }

    public Double getShare() {
        return share;
    }

    public void setShare(Double share) {
        this.share = share;
    }

    @Override
    public void input(){
        System.out.println("---Enter director information---");
        System.out.println("Enter share information ( %, not exceeding 100% ): ");
        boolean check = false;
        do{
            share = new Scanner(System.in).nextDouble();
            if(share > 0 && share <= 100){
                check = true;
            }else {
                System.out.println("Share is not valid, please try again");
            }
        }while (!check);
        super.input();
    }

    @Override
    public void output() {
        System.out.println("---Show director information---");
        super.output();
    }

    @Override
    public double salaryMonthCalculation() {
        return super.getEmployeeSalaryInDay() * super.getEmployeeWorkInMonth();
    }
}
