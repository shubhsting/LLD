package MULTITHREADING.THREADS;

public class Create_Thread_2 implements Runnable {

    @Override
    public void run() {
        for (int index = 0; index < 50; index++) {
            // try {
            // Thread.sleep(3000);
            // } catch (InterruptedException e) {
            // e.printStackTrace();
            // }
            // Thread.yield();
            System.out.println(Thread.currentThread().getName());
        }
    }

}
