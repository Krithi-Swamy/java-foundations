import java.util.ArrayList;
import java.util.Scanner;

public class Build4_TaskTracker {

    public static void viewMenu() {
        System.out.println("Please choose one from below");
        System.out.println("1. View tasks to do from the list");
        System.out.println("2. Add a task to the list");
        System.out.println("3. Remove a task from the list");
        System.out.println("4. Exit");
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>(5);
        list.add("Sleeping for 5.5 hours");
        list.add("Doing meditation for 30 minutes");
        list.add("Studying for 2.5 hours");
        list.add("Playing badminton for 2 hours");
        list.add("Work related tasks");
        boolean flag = true;

        while(flag) {
            viewMenu();
            int choice = scn.nextInt();
            scn.nextLine();
            if(choice == 4) {
                flag = false;
                break;
            } else if(choice == 1) {
                System.out.println();
                for(int i = 0; i < list.size(); i++) {
                    System.out.println((i+1) + ". " + list.get(i));
                }
                System.out.println();
            } else if(choice == 2) {
                if(list.size() == 5) {
                    System.out.println("List is full, please remove the task to add a task");
                } else {
                    System.out.println("Please type the task to add it to the list");
                    String task = scn.nextLine();
                    list.add(task);
                }
            } else if(choice == 3) {
                System.out.println("Please enter the number of the task that you want to remove");
                int task_no = scn.nextInt();
                list.remove(task_no - 1);
            }
        }
    }
}
