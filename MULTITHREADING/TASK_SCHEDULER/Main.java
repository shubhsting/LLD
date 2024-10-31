package MULTITHREADING.TASK_SCHEDULER;

import MULTITHREADING.TASK_SCHEDULER.executor.AdditionTaskExecutor;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.registerTaskExecutor(new AdditionTaskExecutor());
        scheduler.registerTaskExecutor(new AdditionTaskExecutor());


        Thread.sleep(3000);
//        scheduler.scheduleEvery(new CalculationTask(5,8), 2000L);
        scheduler.scheduleAt(new CalculationTask(5,8), System.currentTimeMillis() + 2000);

    }
}
