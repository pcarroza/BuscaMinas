package main.java.models;

import main.java.utils.Random;
import java.util.HashMap;

public class FlatMines {

    private final HashMap<Coordinate, Box> mines;

    public static final int AMOUNT_OF_MINES = 5;

    public FlatMines() {
        this.mines = new HashMap<>();
        this.createFlat();
    }

    private void createFlat() {
        Random random = new Random();
        int counter = 0;
        while (counter < AMOUNT_OF_MINES) {
            int row = random.rand(ConstantFlat.LAST_POSITION_ROW);
            int column = random.rand(ConstantFlat.LAST_POSITION_COLUMN);
            Coordinate coordinate = new Coordinate(row, column);
            if (!this.mines.containsKey(coordinate)) {
                this.mines.put(coordinate, Box.MINE);
                counter += 1;
            }
        }
    }

    public void getMines() {
        System.out.println(this.mines.values());
    }

    public void getCoordinate() {
        System.out.println(this.mines.keySet());
    }

    public boolean isMineInBox(Coordinate coordinate) {
        return this.mines.containsKey(coordinate);
    }

    private void setPositionCoordinate(EnumStateCoordinate whatPosition) {
    }

    public String calculateNumberOfMines(EnumStateCoordinate position) {
        return null;
    }

    public static void main(String[] args) {
    }
}
