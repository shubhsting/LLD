package MULTITHREADING.TASK_SCHEDULER.executor;

import MULTITHREADING.TASK_SCHEDULER.CalculationTask;

public class AdditionTaskExecutor implements ITaskExecutor {
    @Override
    public void execute(CalculationTask task) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " Started Addition Computation" + task.toString());
        Thread.sleep(5000);
        System.out.println(Thread.currentThread().getName() + "Computation Completed: " + (task.a + task.b));
    }
}
