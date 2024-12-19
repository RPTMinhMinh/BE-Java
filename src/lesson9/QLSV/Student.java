package lesson9.QLSV;

import java.util.Scanner;

public class Student {
    private String code;
    private String name;
    private double score;

    public Student() {
        this.code = code;
        this.name = name;
        this.score = score;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student code: ");
        code = sc.nextLine();
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter student score: ");
        score = sc.nextDouble();
    }

    public void output(){
        System.out.println("Student code: " + code);
        System.out.println("Student name: " + name);
        System.out.println("Student score: " + score);
    }
}
