import java.util.Scanner;

/**
 * Created by jc302404 on 30/03/15.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("The To Do list");
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        running: while(true){
            System.out.println("1.Add a new TO DO\n" + "2. View all the To Dos\n" + "3.Mark To Do as completed\n" + "4.Exit\n");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    createToDoItem(scanner,toDoList);
                }


        }
                case 2: {}

                case 3: {}

    }
}
