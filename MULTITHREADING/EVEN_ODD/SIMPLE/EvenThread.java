package MULTITHREADING.EVEN_ODD.SIMPLE;

public class EvenThread implements Runnable {
    int n;
    EvenOddState currentState;

    public EvenThread(int n, EvenOddState currentState) {
        this.n = n;
        this.currentState = currentState;
    }

    @Override
    public void run() {
        System.out.println("thread starteed even");
        int start = 2;
        while (start <= n) {
            synchronized (currentState) {
                while (currentState.getTurn() != EvenOddTurn.EVEN) {
                    try {
                        currentState.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(start);
                start += 2;
                currentState.setTurn(EvenOddTurn.ODD);
                currentState.notifyAll();
            }
        }
        System.out.println("thread ended even");
    }
}
