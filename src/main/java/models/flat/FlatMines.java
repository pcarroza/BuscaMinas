package main.java.models.flat;

import main.java.models.coordinate.Coordinate;
import main.java.models.coordinate.sttateCoordinate.StateCoordinate;
import main.java.utils.Random;
import java.util.HashMap;

public class FlatMines {

    private final HashMap<Coordinate, Box> mines;

    public static final int AMOUNT_OF_MINES = 10;

    public FlatMines() {
        this.mines = new HashMap<>();
        this.createFlat();
    }

    private void createFlat() {
        Random random = new Random();
        int counter = 0;
        while (counter < AMOUNT_OF_MINES) {
            int row = 1 + (int)(Math.random() * ConstantFlat.LAST_POSITION_ROW);
            int column = 1 + (int)(Math.random() * ConstantFlat.LAST_POSITION_COLUMN);
            Coordinate coordinate = new Coordinate(row, column);
            if (!this.mines.containsKey(coordinate)) {
                this.mines.put(coordinate, Box.MINE);
                counter += 1;
            }
        }
    }

    public boolean isMineInBox(Coordinate coordinate) {
        return this.mines.containsKey(coordinate);
    }

    public int calculateNumberOfMines(StateCoordinate position) {
        return 0;
    }

    public boolean isContained(Coordinate coordinate) {
        return this.mines.containsKey(coordinate);
    }
}
