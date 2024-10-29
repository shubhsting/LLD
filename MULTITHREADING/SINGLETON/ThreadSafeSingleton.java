package MULTITHREADING.SINGLETON;

public class ThreadSafeSingleton {
    // volatile makes sure that value is updated in main memory instead of thread cache which might lead to duplicate instances.
    public static volatile ThreadSafeSingleton instance;

    // disadvantage: not thread safe
    public ThreadSafeSingleton getInstance() {
        if (instance == null) instance = new ThreadSafeSingleton();
        return instance;
    }

    // thread safe but is blocking every get instance call. ideally if instance already exists, we don't need to block.
    public synchronized ThreadSafeSingleton getInstance1() {
        if (instance == null) instance = new ThreadSafeSingleton();
        return instance;
    }

    // we will only block if instance is null but for multiple threads, the conditions will pass through and instances will be created after synchronised for all.
    public ThreadSafeSingleton getInstance2() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                instance = new ThreadSafeSingleton();
            }
        }
        return instance;
    }

    // perfect
    public ThreadSafeSingleton getInstance3() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
