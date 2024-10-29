package MULTITHREADING.BLOCKING_QUEUE;

public class Main {
    public static void main(String[] args) {
        ThreadSafeQueue queue = new ThreadSafeQueue(3);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    queue.enqueue(5);
                    queue.enqueue(4);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    queue.enqueue(3);
                    queue.enqueue(2);
                    queue.enqueue(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    queue.dequeue();
                    Thread.sleep(5000);
                    queue.dequeue();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
