//Manage multiple tasks asynchronously with ExecutorService and Callable.
import java.util.*;
import java.util.concurrent.*;

class Task implements Callable<String> {
    private final String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);  // Simulating a time-consuming task
        return taskName + " is completed.";
    }
}

public class ConcurrentProgrammingDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Callable<String> task1 = new Task("Task 1");
        Callable<String> task2 = new Task("Task 2");
        Callable<String> task3 = new Task("Task 3");

        // Ensure you import these classes
        List<Callable<String>> tasks = Arrays.asList(task1, task2, task3);

        List<Future<String>> results = executor.invokeAll(tasks);

        for (Future<String> result : results) {
            System.out.println(result.get());
        }

        executor.shutdown();
    }
}
