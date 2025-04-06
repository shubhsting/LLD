package QUESTIONS.SNAKE;

import java.util.Scanner;

public class Game {
    Snake snake;
    Board board;
    int n;

    public Game(int n) {
        snake = new Snake();
        board = new Board(n, snake);
        System.out.println("entered g");
        addFood();
    }

    public static final String[] DIRECTIONS = { "L", "R", "D", "U" };
    public static final int[][] COORDINATES = { { 0, -1 }, { 0, 1 }, { 1, 0 }, { -1, 0 } };

    public void start() {
        System.out.println("entered");
        Scanner scn = new Scanner(System.in);
        boolean isGameOver = false;
        while (!isGameOver) {
            board.print();
            int[] input = takeInput(scn);
            isGameOver = isGameOver(input[0], input[1]);
            if (isGameOver) {
                System.out.println("Game over!!");
                continue;
            }
            board.update(input[0], input[1]);
            if (!board.isFoodPresent())
                addFood();
        }
    }

    public void addFood() {
        int row;
        int column;
        int n = board.size - 1;
        do {
            row = (int) Math.ceil(Math.random() * n);
            column = (int) Math.ceil(Math.random() * n);
            System.out.println(row + "->" + column);
        } while (snake.isPresent(row, column));
        board.addFood(row, column);
    }

    public int[] takeInput(Scanner scn) {
        System.out.println("Enter input");
        String direction = scn.next();
        for (int index = 0; index < 4; index++) {
            if (direction.equals(DIRECTIONS[index])) {
                int[] snakeHead = snake.head();
                return new int[] { snakeHead[0] + COORDINATES[index][0], snakeHead[1] + COORDINATES[index][1] };
            }
        }
        throw new RuntimeException("Invalid direction passed!");
    }

    public boolean isGameOver(int row, int column) {
        if (row < 0 || row >= board.size || column < 0 || column >= board.size)
            return true;
        if (snake.isPresent(row, column))
            return true;
        return false;
    }
}
