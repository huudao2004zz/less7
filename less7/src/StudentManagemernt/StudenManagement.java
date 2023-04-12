package StudentManagemernt;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class StudenManagement {
    private List<Student> students;
    private Scanner scanner;

    public StudenManagement() {
        students = new ArrayList<>();
        scanner = new Scanner(System.in);

    }

    public void addStudent() {
        System.out.println("Enter roll number : ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Mark: ");
        double mark = scanner.nextDouble();

        Student student = new Student(rollNumber, name, age, mark);
        students.add(student);
        System.out.println("add successfully");
    }

    public void updateStudent() {
        System.out.println("Enter rollnumber of t=student to update: ");
        int rollnumber = scanner.nextInt();
        for (Student student : students) {
            if (rollnumber == student.getRollNumber()) {
                System.out.println("Enter Name: ");
                String name = scanner.nextLine();
                System.out.println("Enter Age: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter Mark: ");
                double mark = scanner.nextDouble();

                student.setName(name);
                student.setAge(age);
                student.setMark(mark);
            } else {
                System.out.println("Student not found !");
            }
        }
    }
    public void deleteStudent() {
        System.out.println("Enter Roll Number of student to delete:");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();
        boolean removed = students.removeIf(student -> student.getRollNumber() == rollNumber);
        if (removed) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }
    public void searchStudents() {
        System.out.println("Enter search query:");
        String query = scanner.nextLine();
        List<Student> results = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().contains(query)) {
                results.add(student);
            }
        }
        if (results.isEmpty()) {
            System.out.println("No results found.");
        } else {
            System.out.println("Search results:");
            for (Student result : results) {
                System.out.println(result.toString());
            }
        }
    }
    public void saveToFile() {
        System.out.println("Enter file name to save:");
        String fileName = scanner.nextLine();
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(students);
            System.out.println("Data saved to file.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("List of students:");
            for (Student student : students) {
                System.out.println(student.toString());
            }
        }
    }
    public void loadFromFile() {
        System.out.println("Enter file name to load:");
        String fileName = scanner.nextLine();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            students = (List<Student>) inputStream.readObject();
            System.out.println("Data loaded from file.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
        public void run() {
            System.out.println("1 : Add Student");
            System.out.println("2 : Update Student");
            System.out.println("3 : Delete Student");
            System.out.println("4 : Seach Student");
            System.out.println("5 : Display Student");
            System.out.println("6 : Save to file");
            System.out.println("7 : load from file");
            System.out.println("8 : Exit");
            System.out.println("your choice : ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    searchStudents();
                    break;
                case 5:
                    displayAllStudents();
                    break;
                case 6:
                    saveToFile();
                    break;
                case 7:
                    loadFromFile();
                    break;
                case 8:
                    boolean run = false;
                    break;
            }
        }
    }
