package MULTITHREADING.EVEN_ODD.SIMPLE;

public class EvenOddState {
    EvenOddTurn turn;
    public EvenOddState(EvenOddTurn turn) {
        this.turn = turn;
    }
    public void setTurn(EvenOddTurn turn) {
        this.turn = turn;
    }

    public EvenOddTurn getTurn() {
        return this.turn;
    }
}
