package QUESTIONS.TIC_TAC_TOE;

import java.util.List;
import java.util.Scanner;

public class Game {
    List<Player> players;
    Board board;
    int currentPlayer;
    int size;
    public Game(List<Player> players, int n) {
        this.players = players;
        this.board = new Board(n);
        this.currentPlayer = 0;
        this.size = n;
    }


    public void start() {
        boolean isGameOver = false;
        Scanner scn = new Scanner(System.in);
        while(!isGameOver) {
            board.print();
            int[] coordinates = takeInput(scn, currentPlayer);
            if(!board.isFree(coordinates)) {
                System.out.println("The entered location is already occupied!Re enter input");
                continue;
            }
            Player player = players.get(currentPlayer);
            board.place(coordinates, player);
            isGameOver = isGameOver(player.piece, coordinates);
            if(isGameOver) {
                System.out.println("Game over!! Player: " + player.playerName + " won!");
                break;
            }
            currentPlayer = (currentPlayer+1) % players.size();
        }
    }

    public int[] takeInput(Scanner scn, int currentPlayer) {
        System.out.println("Player " + players.get(currentPlayer).playerName + "enter your input in format x,y");
        String input = scn.next();
        String[] coordinates = input.split(",");
        if(coordinates.length!=2) throw new RuntimeException("Invalid input!!");

        return new int[]{Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1])};
    }
    public boolean isGameOver(Piece p, int[] coordinates) {
        boolean isPresentInRow = true;
        boolean isPresentInColumn = true;
        for(int index = 0; index<size; index++) {
            isPresentInColumn &= board.contains(p, index, coordinates[1]);
            isPresentInRow &= board.contains(p, coordinates[0], index) ;
        }
        return isPresentInRow || isPresentInColumn;
    }
   
}

