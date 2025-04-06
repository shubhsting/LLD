package QUESTIONS.SNAKE;

import java.util.LinkedList;

public class Snake {
    LinkedList<int[]> snake;

    public Snake() {
        snake = new LinkedList<>(); 
        snake.add(new int[]{0,0});
    }

    public boolean isPresent(int row, int column) {
        for(int[] coordinate: snake) {
            if(coordinate[0] == row && coordinate[1] == column) return true;
        }
        return false;
    }

    public int[] head() {
        return snake.getFirst();
    }

    public void update(int row, int column, boolean foodPresent) {
        snake.addFirst(new int[]{row, column});
        if(!foodPresent) {
            snake.removeLast();
        }
    }
}
