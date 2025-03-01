package app;
import java.util.InputMismatchException;
import java.util.Scanner;
import services.TaskQueueService;
import model.Task;


public class QueueApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        TaskQueueService queue = new TaskQueueService();
        int choice = 0;
        while (choice != 4){
            System.out.println ("\n=== Task Queue Menu ===");
            System.out.println("1. Add a task");
            System.out.println("2. List tasks");
            System.out.println("3. Remove a task");
            System.out.println("4. Exit");
            while(true) {
                try {
                    System.out.println("Enter your choice: ");
                    choice = input.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input: Please enter an integer only.");
                    input.nextLine();
                }
            }
            input.nextLine();
            switch (choice){
                case 1:
                    int id = 0;
                    while(true) {
                        try {
                            System.out.print("Enter Task ID: ");
                            id = input.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input: Please enter an integer only.");
                            input.nextLine();
                        }
                    }
                    input.nextLine();
                    System.out.print("Enter Task Description: ");
                    String desc = input.nextLine();

                    Task task = new Task(id, desc);
                    queue.enqueue(task);
                    System.out.println("Task Added");
                    break;
                case 2:
                    System.out.println("Current task(s) in queue:");
                    for (Task t: queue.listTask()){
                        System.out.println(t);
                    }
                    break;
                case 3:
                    Task remove = queue.dequeue();
                    if (remove != null){
                        System.out.println("Removed Task: " + remove);
                    }
                    else {
                        System.out.println("Queue is empty; there is no task remove.");
                    }
                case 4:
                    System.out.println("Exiting application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select from 1 to 4.");


            }
        }
    input.close();





    }
}
