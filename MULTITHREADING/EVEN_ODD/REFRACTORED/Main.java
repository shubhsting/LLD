package MULTITHREADING.EVEN_ODD.REFRACTORED;

public class Main {
    public static void main(String[] args) {
        SeriesState seriesState = new SeriesState(SeriesTurnName.ODD);
        SeriesPrinter evenSeriesprinter = new SeriesPrinter(SeriesTurnName.EVEN, 2, 2, 5, SeriesTurnName.FIB, seriesState);
        SeriesPrinter oddSeriesprinter = new SeriesPrinter(SeriesTurnName.ODD, 1, 2, 5, SeriesTurnName.EVEN, seriesState);
//        SeriesPrinter zeroSeriesprinter = new SeriesPrinter(SeriesTurnName.ZERO, 0, 0, 5, SeriesTurnName.ODD, seriesState);
        FibonacciSeriesPrinter fibonacciSeriesPrinter = new FibonacciSeriesPrinter(SeriesTurnName.FIB, 5, SeriesTurnName.ODD, seriesState);
        new Thread(evenSeriesprinter).start();
        new Thread(oddSeriesprinter).start();
        new Thread(fibonacciSeriesPrinter).start();
    }
}
