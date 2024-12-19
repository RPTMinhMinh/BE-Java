package lesson9.QLSV;

import java.util.*;

public class StudentManager {
    private ArrayList<Student> students;
    private HashSet<String> studentCode;

    public StudentManager() {
        students = new ArrayList<>();
        studentCode = new HashSet<>();
    }

    public void duplicateStudentCode(String code) {
        if (studentCode.contains(code)) {
            throw new IllegalArgumentException("Student code already exists");
        }else {
            System.out.println("Student code already to use");
        }
    }

    public void addStudent() {
        try {
            Student student = new Student();
            student.input();
            duplicateStudentCode(student.getCode());
            students.add(student);
            studentCode.add(student.getCode());
            System.out.println("Added successfully");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void removeStudent() {
        System.out.println("Enter student code you want to remove");
        Scanner scanner = new Scanner(System.in);
        String removeCode = scanner.nextLine();
        try{
            Student studentRemove = null;
            for (Student student : students) {
                if (student.getCode().equals(removeCode)) {
                    studentRemove = student;
                    break;
                }
            }
            if (studentRemove != null) {
                students.remove(studentRemove);
                studentCode.remove(studentRemove.getCode());
                System.out.println("Remove successfully");
            }else {
                throw new IllegalArgumentException("Student code does not exist");
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public void showStudent() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println("---------Student's information " + (i + 1) + "---------");
            students.get(i).output();
        }
    }

    public void searchStudentByName() {
        System.out.println("Enter student name you want to search: ");
        String searchName = new Scanner(System.in).nextLine();
        boolean found = false;
        try {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getName().equals(searchName)) {
                    students.get(i).output();
                    found = true;
                }
            }
            if (!found) {
                throw new IllegalArgumentException("Student name does not exist");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void sortStudentsByScore() {
        try{
            if(students.isEmpty()){
                throw new IllegalArgumentException("Student list is empty");
            }else {
                System.out.println("-----Student's score sorted-----");
                Collections.sort(students, Comparator.comparingDouble(Student::getScore));
                for(Student student : students){
                    student.output();
                    System.out.println("------------------");
                }
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public void searchStudentByCode() {
        System.out.println("Enter student code you want to search: ");
        String searchCode = new Scanner(System.in).nextLine();
        if(studentCode.contains(searchCode)){
            System.out.println("Student code existed");
        }else {
            System.out.println("cannot find student code");
        }
    }
}
