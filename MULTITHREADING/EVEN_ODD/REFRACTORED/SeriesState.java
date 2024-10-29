package MULTITHREADING.EVEN_ODD.REFRACTORED;

public class SeriesState {
    private SeriesTurnName state;

    SeriesState(SeriesTurnName state) {
        this.state = state;
    }

    public void setState(SeriesTurnName state) {
        this.state = state;
    }

    public SeriesTurnName getTurn() {
        return this.state;
    }
}
