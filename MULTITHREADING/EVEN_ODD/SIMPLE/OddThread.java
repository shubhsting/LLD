package MULTITHREADING.EVEN_ODD.SIMPLE;

public class OddThread implements Runnable {
    int n;
    EvenOddState currentState;


    public OddThread(int n, EvenOddState currentState) {
        this.n = n;
        this.currentState = currentState;
    }

    @Override
    public void run() {
        System.out.println("thread started odd");
        int start = 1;
        while (start <= n) {
            synchronized (currentState) {
                while (currentState.getTurn() != EvenOddTurn.ODD) {
                    try {
                        currentState.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(start);
                start += 2;
                currentState.setTurn(EvenOddTurn.EVEN);
                currentState.notifyAll();
            }
        }
    }
}
