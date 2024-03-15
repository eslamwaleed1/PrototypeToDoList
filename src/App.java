import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        ToDoListPrototype prototypeList = new ToDoListPrototype();

        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");
        prototypeList.addTask(task1);
        prototypeList.addTask(task2);

        List<Task> tasks = prototypeList.getTasks();
        for (Task task : tasks) {
            System.out.println(task.getName());
        }
    }
}
