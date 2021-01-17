package main.java.models.flatFactory;

import main.java.models.*;

import java.util.HashMap;

public class HashFlat implements Flat {

    private HashMap<Coordinate, Box> flat;

    private final FlatMines mines;

    public HashFlat() {
        this.createFlat();
        this.mines = new FlatMines();
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
        Box box = Box.NUMBER_OF_MINES_AROUND_THE_BOX;
        String numberMines = this.mines.calculateNumberOfMines(coordinate.whatPosition());
        box.setNumberOfMines(numberMines);
        this.change(coordinate, box);
    }

    @Override
    public void removeFlag(Coordinate coordinate) {
        assert coordinate != null;
        this.change(coordinate, Box.FLAG);
    }

    @Override
    public void putFlagInBox(Coordinate coordinate) {
        assert coordinate != null;
        this.change(coordinate, Box.FLAG);
    }

    @Override
    public boolean isEmptyBox(Coordinate coordinate) {
        assert coordinate != null;
        return this.isSomethingInTheBox(coordinate, Box.EMPTY);
    }

    @Override
    public boolean isFlagInBox(Coordinate coordinate) {
        return this.isSomethingInTheBox(coordinate, Box.FLAG);
    }

    @Override
    public boolean isMineInBox(Coordinate coordinate) {
        assert coordinate != null;
        return this.mines.isMineInBox(coordinate);
    }

    @Override
    public Box getBox(Coordinate coordinate) {
        assert coordinate != null;
        return this.flat.get(coordinate);
    }

    private void change(Coordinate coordinate, Box box) {
        this.flat.replace(coordinate, box);
    }

    private boolean isSomethingInTheBox(Coordinate coordinate, Box box) {
        return this.flat.get(coordinate).isEquals(box);
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




