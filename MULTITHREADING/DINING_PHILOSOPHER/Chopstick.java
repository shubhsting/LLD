package MULTITHREADING.DINING_PHILOSOPHER;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Chopstick {
    public int index;
    public Lock lock;

    public Chopstick(int index) {
        this.index = index;
        lock = new ReentrantLock();
    }
}
