/**
 * Class representing a todo list.
 * TodoList object should aggregate TodoItem objects.
 */

 import java.util.*;

public class TodoList
{
static TodoItem item;
    static ArrayList<String> ToDoList = new ArrayList<String>();

    public static String add_item(String title)
    {
        String new_item;
        new_item = item.ToDoItem(title);
        ToDoList.add(new_item);
    }

    // public String get_item(int index)
    // {
    //     if(index >= length(ToDoList))
    //     {
    //
    //     }
    // }
}
