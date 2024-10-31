package MULTITHREADING.TASK_SCHEDULER.executor;

import MULTITHREADING.TASK_SCHEDULER.CalculationTask;

public interface ITaskExecutor {
    public void execute(CalculationTask task) throws InterruptedException;
}
