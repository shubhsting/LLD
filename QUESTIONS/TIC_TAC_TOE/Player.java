package QUESTIONS.TIC_TAC_TOE;

public class Player {
    String playerName;
    Piece piece;
    public Player(String playerName, Piece p) {
        this.piece = p;
        this.playerName = playerName;
    }
}
