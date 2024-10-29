package MULTITHREADING.EVEN_ODD.REFRACTORED;

public class FibonacciSeriesPrinter implements Runnable {
    int count;
    SeriesState seriesState;
    SeriesTurnName nextState;
    SeriesTurnName myState;

    public FibonacciSeriesPrinter(SeriesTurnName myState, int count, SeriesTurnName nextState, SeriesState seriesState) {
        this.seriesState = seriesState;
        this.myState = myState;
        this.nextState = nextState;
        this.count = count;
    }

    @Override
    public void run() {
        int a = 0;
        int current = 1;
        int cnt = 0;

        while (cnt <= count) {
            synchronized (seriesState) {
                while (seriesState.getTurn() != myState) {
                    try {
                        seriesState.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(myState + " : " + current);
                int temp = current;
                current = current + a;
                a = temp;
                cnt++;
                seriesState.setState(nextState);
                seriesState.notifyAll();
            }
        }
    }
}
