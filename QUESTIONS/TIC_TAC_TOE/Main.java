package QUESTIONS.TIC_TAC_TOE;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Shubham", new Piece("X"));
        Player p2 = new Player("Kajal", new Piece("O"));
        List<Player> players = new ArrayList<>();
        players.add(p2);
        players.add(p1);
        Game game = new Game(players, 3);
        game.start();
    }
}
