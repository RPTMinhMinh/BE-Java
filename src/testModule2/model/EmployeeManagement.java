package testModule2.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeManagement {
    private Map<String, Employee> employeeManagement;


    public EmployeeManagement() {
        employeeManagement = new HashMap<>();
    }


    public void employeeManagerCase() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-----QUẢN LÝ NHÂN VIÊN-----");
            System.out.println("4.1. Thêm nhân viên mới.");
            System.out.println("4.2. Xem danh sách nhân viên");
            System.out.println("4.3. Gán tài khoản cho nhân viên.");
            System.out.println("4.4. Thoát");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    showEmployees();
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("!!! Kết thúc quản lý nhân viên !!!");
                    break;
            }
        }while (choice != 4);
    }

    public void addEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID nhân viên: ");
        String id = sc.nextLine();
        if (employeeManagement.containsKey(id)) {
            System.out.println("Mã nhân viên đã tồn tại");
            return;
        }
        System.out.println("Tên nhân viên: ");
        String name = sc.nextLine();
        System.out.println("Lương cơ bản: ");
        double salary = sc.nextDouble();
        Employee newEmployee = new Employee(id, name, salary);
        employeeManagement.put(id, newEmployee);
        System.out.println("----------------------------------");
        System.out.println("Thêm nhân viên thành công");
        System.out.println("----------------------------------");
    }

    // Tìm nhân viên theo ID
    public Employee findEmployeeById(String employeeId) {
        return employeeManagement.get(employeeId.trim());
    }

    // Hiển thị danh sách nhân viên
    public void showEmployees() {
        if (employeeManagement.isEmpty()) {
            System.out.println("Không có nhân viên trong hệ thống.");
            return;
        }
        for (Employee employee : employeeManagement.values()) {
            System.out.println("ID nhân viên: " + employee.getId());
            System.out.println("Tên nhân viên: " + employee.getName());
            System.out.println("Lương cơ bản: " + employee.getSalary());
            System.out.println("Số lượng tài khoản đang quản lý: " + employee.getManagedAccounts().size());
            System.out.println("----------------------------");
        }
    }

    public void addSampleEmployees() {
        employeeManagement.put("E001", new Employee("E001", "Alice", 100000));
    }
}
