import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToDoListApp {
    private static ArrayList<String> toDoList = new ArrayList<>();
    private static BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        int choice;

        do {
            System.out.println("1. Add task");
            System.out.println("2. Delete tasks");
            System.out.println("3. View tasks");
            System.out.println("4. Mark tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(Br.readLine());

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    DeleteTask();
                    break;
                case 3:{
                    viewTasks();
                    break;
                }
                case 4:{
                    MarkTask();
                    break;
                }
                case 5:
                    System.out.println("Exiting the to-do list application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);
        Br.close();
    }

    private static void DeleteTask()throws IOException{
        viewTasks();
        System.out.print("OUT OF THESE "+toDoList.size()+", Which Task you want to delete? : ");
        int indx = Integer.parseInt(Br.readLine());
        toDoList.remove(indx);
        System.out.println("DELETION TASK COMPLETED.");
    }

    private static void MarkTask()throws IOException{
        viewTasks();
        System.out.print("OUT OF THESE WHICH TASK IS COMPLETED? : ");
        int indx = Integer.parseInt(Br.readLine());
        if(indx<1){
            System.out.println("INVALID INPUT AS "+indx);
            System.out.println("Try Again....");
            MarkTask();
        }else{
            toDoList.set(indx-1, toDoList.get(indx-1)+" [DONE]");
        }
        System.out.println("TASK MARKING COMPLETED.");
    }

    private static void addTask() throws IOException{
        System.out.print("\nEnter the task: ");
        String task = Br.readLine();
        toDoList.add(task);
        System.out.println("Task added successfully!\n");
    }

    private static void viewTasks() {
        System.out.println("\n-------------------------------------------------------");
        System.out.println("|              Tasks in the to-do list:               |");
        System.out.println("-------------------------------------------------------");
        if (toDoList.isEmpty()) {
            System.out.println("No tasks in the to-do list.");
        } else {
            for (int i = 0; i < toDoList.size(); i++) {
                System.out.println((i + 1) + ". " + toDoList.get(i));
            }
        }
        System.out.println("-------------------------------------------------------\n");
    }
}