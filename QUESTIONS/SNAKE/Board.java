package QUESTIONS.SNAKE;

public class Board {
    int size;
    int[] food;
    Snake snake;

    public Board(int size, Snake snake) {
        this.size = size;
        this.snake = snake;
    }

    public void print() {
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if(snake.isPresent(r, c)) {
                    System.out.print("S");
                } else if(food[0] == r && food[1] == c) {
                    System.out.print("F");
                } else {
                    System.out.print(".");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void addFood(int row, int column) {
        this.food = new int[] { row, column };
    }

    public void update(int row, int column) {
        boolean eatFood = food[0] == row && food[1] == column;
        snake.update(row, column, eatFood);
        if (eatFood) {
            food[0] = -1;
            food[1] = -1;
        }
    }

    public boolean isFoodPresent() {
        return food[0] != -1 && food[1] != -1;
    }
}
