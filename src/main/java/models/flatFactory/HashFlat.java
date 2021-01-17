package main.java.models.flatFactory;

import main.java.models.*;

import java.util.HashMap;

public class HashFlat implements Flat {

    private HashMap<Coordinate, Box> flat;

    private final FlatMines mines = null;

    public HashFlat() {
        this.createFlat();
        //mines = new FlatMines();
    }

    private void createFlat() {
        this.flat = new HashMap<>();
        for (int i = 1; i <= ConstantFlat.LAST_POSITION_ROW; i++) {
            for (int j = 1; j <= ConstantFlat.LAST_POSITION_COLUMN; j++) {
                this.flat.put(new Coordinate(i, j), Box.EMPTY);
            }
        }
    }

    @Override
    public void openBox(Coordinate coordinate) {
        assert coordinate != null;
        String numberMines = this.mines.calculateNumberOfMines(coordinate.whatPosition());
        Box box = Box.NUMBER_MINES;
        box.setNumberOfMines(numberMines);
        this.flat.replace(coordinate, box);
    }

    @Override
    public void removeFlag(Coordinate coordinate) {
        assert coordinate != null;
        this.flat.replace(coordinate, Box.FLAG);
    }

    @Override
    public void putFlagInBox(Coordinate coordinate) {
        assert coordinate != null;
        this.flat.replace(coordinate, Box.FLAG);
    }

    @Override
    public boolean isEmptyBox(Coordinate coordinate) {
        assert coordinate != null;
        return this.flat.get(coordinate).isEquals(Box.EMPTY);
    }

    @Override
    public boolean isFlagInBox(Coordinate coordinate) {
        return false;
    }

    @Override
    public boolean isMineInBox(Coordinate coordinate) {
        assert coordinate != null;
        return true;
    }

    @Override
    public Box getBox(Coordinate coordinate) {
        assert coordinate != null;
        return this.flat.get(coordinate);
    }

    public static void main(String[] args) {
        HashFlat flat = new HashFlat();
        for (int i = 1; i < ConstantFlat.LAST_POSITION_COLUMN; i++) {
            for (int j = 1; j < ConstantFlat.LAST_POSITION_COLUMN; j++) {
                System.out.print("  " + flat.getBox(new Coordinate(i,j)));
            }
            System.out.println();
        }
    }
}




