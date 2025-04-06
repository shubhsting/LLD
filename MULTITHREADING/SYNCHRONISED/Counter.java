package MULTITHREADING.SYNCHRONISED;

public class Counter {
    int number;

    Counter(int number) {
        this.number = number;
    }

    public synchronized void increment() {
        number++;
    }

    public int getNo() {
        return this.number;
    }
}
