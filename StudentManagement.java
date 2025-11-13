// File Name: StudentManagement.java
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch(choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();
                    students.add(new Student(name, age, grade));
                    System.out.println("Student added successfully!\n");
                    break;
                case 2:
                    if(students.isEmpty()) {
                        System.out.println("No students found.\n");
                    } else {
                        System.out.println("=== Student List ===");
                        for(Student s : students) {
                            s.displayInfo();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.\n");
            }
        } while(choice != 3);

        sc.close();
    }
}
