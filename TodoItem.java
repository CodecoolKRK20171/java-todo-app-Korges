/**
 * Class representing a single todo item.
 *
 */

public class TodoItem
{
    String title;
    boolean is_done;


    public void ToDoItem(String title)
    {
        this.title = title;
        this.is_done = is_done;
    }

    public void mark()
    {
        this.is_done = true;
    }

    public void unmark()
    {
        this.is_done = false;
    }

    public String print_ToDoItem()
    {
        String mark = " ";
        if(this.is_done)
        {
            mark = "X";
        }
        return "%s %s\n".format(mark, this.title);
    }
}
