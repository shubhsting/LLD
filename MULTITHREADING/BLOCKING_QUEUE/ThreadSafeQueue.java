package MULTITHREADING.BLOCKING_QUEUE;

import java.util.ArrayList;
import java.util.List;

public class ThreadSafeQueue {

    private final List<Integer> items;
    final int size;

    ThreadSafeQueue(int size) {
        this.size = size;
        items = new ArrayList<>();
    }

    public void enqueue(Integer element) throws InterruptedException {
        synchronized (this) {
            while (items.size() >= size) {
                System.out.println("item waiting to be added: " + element);
                wait();
            }
            System.out.println("item added: " + element);
            items.add(element);
            notifyAll();
        }
    }

    public Integer dequeue() throws InterruptedException {
        synchronized (this) {
            while (items.isEmpty()) {
                System.out.println("item waiting to be removed");
                wait();
            }
            Integer item = items.remove(0);
            System.out.println("de: dequeued element and notifying" + item);
            notifyAll();
            return item;
        }
    }
}
