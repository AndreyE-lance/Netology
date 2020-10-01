package task222;

import java.util.Random;

public class GameField {
    private static final int EMPTY = 0;
    private static final int SHIP = 1;
    private static final int DEAD = 2;
    private static final int MISS = 3;
    private static final int MAX_COUNT = 10;
    private int size;
    private int ships;
    private int[][] field;

    public GameField(int size) {
        this.size = size;
        createField(size);
        createShips();
        printField();
    }

    private void createField(int size) {
        field = new int[size][size];
        for (int[] i : field) {
            for (int j : i) {
                j = EMPTY;
            }
        }
    }

    public void printField() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.format("%4d", field[i][j]);
            }
            System.out.println();
        }
    }

    public boolean isShip(int x, int y) {
        if (this.field[x][y] == SHIP) return true;
        else return false;
    }

    public void createShips() {
        Random random = new Random();
        for (int i = 0; i < MAX_COUNT; i++) {
            int shipPlace1 = random.nextInt(this.size);
            int shipPlace2 = random.nextInt(this.size);
            if (this.field[shipPlace1][shipPlace2] == SHIP) {
                i--;
            }
            this.field[shipPlace1][shipPlace2] = SHIP;
        }
        ships = MAX_COUNT;
    }

    public int getShips() {
        return ships;
    }

    public int shotResult(int x, int y) {
        int ret=0;
        try {
            if (this.field[x][y] == 0) {
                this.field[x][y] = MISS;
                ret = 0;
            }else if (isShip(x, y)) {
                ships--;
                this.field[x][y] = DEAD;
                ret = 1;
            }else if (this.field[x][y] == DEAD) ret= 2;
             else if (this.field[x][y] == MISS) ret= 3;
        } catch (ArrayIndexOutOfBoundsException e) {
            ret= -1;
        }
        return ret;
    }
}
