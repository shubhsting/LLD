package MULTITHREADING.EVEN_ODD.SIMPLE;

public class EvenOddRunner {
    public static void run() {
        EvenOddState evenOddState = new EvenOddState(EvenOddTurn.ODD);
        final EvenThread evenThread = new EvenThread(10, evenOddState);
        final OddThread oddThread = new OddThread(10, evenOddState);
        new Thread(oddThread).start();
        new Thread(evenThread).start();
    }
}
