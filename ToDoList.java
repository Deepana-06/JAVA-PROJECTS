
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== To-Do List ===");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Complete Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch(choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String desc = sc.nextLine();
                    tasks.add(new Task(desc));
                    System.out.println("Task added!\n");
                    break;
                case 2:
                    if(tasks.isEmpty()) System.out.println("No tasks found.");
                    else {
                        System.out.println("Task List:");
                        for(int i=0; i<tasks.size(); i++) {
                            System.out.print((i+1) + ". ");
                            tasks.get(i).display();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter task number to mark completed: ");
                    int num = sc.nextInt();
                    if(num > 0 && num <= tasks.size()) {
                        tasks.get(num-1).markCompleted();
                        System.out.println("Task marked completed!");
                    } else {
                        System.out.println("Invalid task number!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while(choice != 4);
        sc.close();
    }
}
