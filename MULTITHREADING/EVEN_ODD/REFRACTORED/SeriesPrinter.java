package MULTITHREADING.EVEN_ODD.REFRACTORED;

public class SeriesPrinter implements Runnable {
    SeriesState seriesState;
    int start;
    int gap;
    int count;
    SeriesTurnName nextState;
    SeriesTurnName myState;

    public SeriesPrinter(SeriesTurnName myState, int start, int gap, int count, SeriesTurnName nextState, SeriesState seriesState) {
        this.start = start;
        this.seriesState = seriesState;
        this.myState = myState;
        this.nextState = nextState;
        this.gap = gap;
        this.count = count;
    }

    @Override
    public void run() {
        int cnt =0;
        while (cnt <= count) {
            synchronized (seriesState) {
                while (seriesState.getTurn() != myState) {
                    try {
                        seriesState.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(myState + " : " + start);
                start += gap;
                cnt++;
                seriesState.setState(nextState);
                seriesState.notifyAll();
            }
        }
    }
}
