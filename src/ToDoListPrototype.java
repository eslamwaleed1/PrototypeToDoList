import java.util.ArrayList;
import java.util.List;

public class ToDoListPrototype {
    private List<Task> tasks;

    public ToDoListPrototype() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks() {
        List<Task> clonedTasks = new ArrayList<>();
        for (Task task : tasks) {
            try {
                clonedTasks.add(task.clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        return clonedTasks;
    }
}


