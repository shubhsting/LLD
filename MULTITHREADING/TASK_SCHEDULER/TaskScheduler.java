package MULTITHREADING.TASK_SCHEDULER;


import MULTITHREADING.TASK_SCHEDULER.executor.ITaskExecutor;
import MULTITHREADING.TASK_SCHEDULER.executor.TaskWorker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class TaskScheduler {
    final PriorityQueue<QueueTaskEntry> queue;
    final List<ITaskExecutor> executors;

    public TaskScheduler() {
        queue = new PriorityQueue<>(Comparator.comparingLong(a -> a.timeEpoch));
        executors = new ArrayList<>();
    }

    public void registerTaskExecutor(ITaskExecutor executor) {
        executors.add(executor);
        new Thread(new TaskWorker(executor, queue)).start();
    }

    public void scheduleAt(CalculationTask task, Long timeEpoch) {
        synchronized (queue) {
            queue.add(new QueueTaskEntry(task, timeEpoch, -1L));
            queue.notifyAll();
        }
    }

    public void scheduleEvery(CalculationTask task, Long periodInMs) {
        synchronized (queue) {
            queue.add(new QueueTaskEntry(task, System.currentTimeMillis() + periodInMs, periodInMs));
            queue.notifyAll();
        }
    }
}
