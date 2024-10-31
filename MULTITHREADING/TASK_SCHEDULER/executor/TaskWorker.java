package MULTITHREADING.TASK_SCHEDULER.executor;

import MULTITHREADING.TASK_SCHEDULER.QueueTaskEntry;
import lombok.SneakyThrows;

import java.util.Objects;
import java.util.PriorityQueue;

public class TaskWorker implements Runnable {
    ITaskExecutor executor;
    final PriorityQueue<QueueTaskEntry> queue;

    public TaskWorker(ITaskExecutor executor, PriorityQueue<QueueTaskEntry> queue) {
        this.executor = executor;
        this.queue = queue;
    }

    @SneakyThrows
    @Override
    public void run() {
        while (true) {
            QueueTaskEntry entry;
            synchronized (queue) {
                while (true) {
                    while (queue.isEmpty()) {
                        System.out.println(Thread.currentThread().getName() + " : Queue is empty hence waiting for element to come!");
                        queue.wait();
                    }
                    System.out.println(Thread.currentThread().getName() + " is fetching peek message!!");
                    entry = queue.peek();
                    if(processTask(Objects.requireNonNull(queue.peek()))) break;
                }
                queue.poll();
            }
            executor.execute(entry.getMessage());
        }
    }

    private boolean processTask(QueueTaskEntry entry) throws InterruptedException {
        long timeRemaining = entry.getTimeEpoch() - System.currentTimeMillis();
        if (timeRemaining > 0) {
            System.out.println(Thread.currentThread().getName() + " : Message received, Time remaining was found to be " + timeRemaining);
            queue.wait(timeRemaining); //will wait till this time or next notify
            return false;
        } else {
            System.out.println(Thread.currentThread().getName() + " thread is now processing the message!!");
            // if we want to schedule recursively
            if (entry.getIntervalInMs() != -1) {
                queue.add(new QueueTaskEntry(entry.getMessage(), entry.getTimeEpoch() + entry.getIntervalInMs(), entry.getIntervalInMs()));
                queue.notifyAll();
            }
            return true;
        }
    }
}
