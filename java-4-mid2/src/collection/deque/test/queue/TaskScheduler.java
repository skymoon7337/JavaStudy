package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {
    Queue<Task> tasksQueue = new ArrayDeque<>();

    public void addTask(Task task) {
        tasksQueue.offer(task);
    }

    public int getRemainingTasks() {
        return tasksQueue.size();
    }

    public void processNextTask() {
        Task task = tasksQueue.poll();
        if (task != null){
            task.execute();
        }
    }
}
