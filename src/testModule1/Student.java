package testModule1;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String code;

    public Student(){}

    public Student(String name, int age, String code) {
        this.name = name;
        this.age = age;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma SV: ");
        code = sc.nextLine();
        System.out.println("Nhap ten SV: ");
        name = sc.nextLine();
        System.out.println("Nhap tuoi SV: ");
        age = sc.nextInt();
    }

    public void output(){
        System.out.println("Ma Sinh Vien: " + code);
        System.out.println("Ten Sinh Vien: " + name);
        System.out.println("Tuoi Sinh Vien: " + age);
    }
}
