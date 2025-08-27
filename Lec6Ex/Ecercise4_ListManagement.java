package Lec6Ex;

import java.util.ArrayList;
import java.util.Scanner;

public class Ecercise4_ListManagement {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- TO-DO LIST MENU ---");
            System.out.println("1. Add a new task");
            System.out.println("2. View all tasks");
            System.out.println("3. Remove a task by index");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task added!");
                    break;
                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks yet!");
                    } else {
                        System.out.println("Your To-Do List:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println(i + ". " + tasks.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter the index of the task to remove: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < tasks.size()) {
                        tasks.remove(index);
                        System.out.println("Task removed!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }
}
