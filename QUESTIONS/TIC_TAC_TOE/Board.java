package QUESTIONS.TIC_TAC_TOE;

public class Board {
    Piece[][] board;
    int size;

    public Board(int n) {
        this.board = new Piece[n][n];
        this.size = n;
    }

    public void print() {
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (board[r][c] == null)
                    System.out.print(".");
                else
                    System.out.print(board[r][c].symbol);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public boolean isFree(int[] coordinates) {
        return board[coordinates[0]][coordinates[1]] == null;
    }

    public void place(int[] coordinates, Player player) {
        board[coordinates[0]][coordinates[1]] = player.piece;
    }

    public boolean contains(Piece p, int row, int column) {
        if (board[row][column] != null && board[row][column].symbol.equals(p.symbol))
            return true;
        return false;
    }
}
