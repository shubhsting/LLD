package MULTITHREADING.SYNCHRONISED;

public class MyThread extends Thread {
    Counter counter;
    String name;

    MyThread(String name, Counter counter) {
        super(name);
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int index = 0; index < 1000; index++)
            counter.increment();
    }
}
