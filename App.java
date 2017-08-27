/**
 * Class representing the TodoApp application.
 * It is the main entry point for this program.
 */

import java.util.Scanner;



public class App
{


    static TodoItem item;
    static TodoList list;


    public void main(String[] args)
    {
        add_new_ToDoItem();
    }

    public static String add_new_ToDoItem()
    {
        boolean is_done = false;
        System.out.println("Add new ToDoItem: ");
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
         list.add_item(title);
        return title;
    }
}
