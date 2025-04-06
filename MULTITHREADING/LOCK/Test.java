package MULTITHREADING.LOCK;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    Lock lock;
    public Test() {
        this.lock = new ReentrantLock(true);
        lock.lock();
    }
}
