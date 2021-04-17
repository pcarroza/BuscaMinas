package main.java.models;

import main.java.models.flat.Box;
import main.java.models.flat.Flat;
import main.java.models.flat.FlatFactoryMethod;
import main.java.models.coordinate.Coordinate;

public class Board extends Subject {

    private final Flat flat;

    public Board() {
        this.flat = FlatFactoryMethod.getInstance().getFlat();
    }

    public void openBox(Coordinate coordinate) {
        assert coordinate != null;
        this.flat.openBox(coordinate);
    }

    public boolean isOpenBox(Coordinate coordinate) {
        assert coordinate != null;
        return this.flat.isEmptyBox(coordinate);
    }

    public boolean isOpenAnyBox() {
        return this.flat.isOpenAnyBox();
    }

    public boolean isBoxOccupied(Coordinate coordinate) {
        return this.flat.isBoxOccupied(coordinate);
    }

    public void removerFlag(Coordinate coordinate) {
        assert coordinate != null;
        this.flat.removeFlag(coordinate);
    }

    public boolean isCompleteBoard() {
        return this.flat.isCompleteBoard();
    }

    public void putFlagInBox(Coordinate coordinate) {
        assert coordinate != null;
        this.flat.putFlagInBox(coordinate);
    }

    public boolean isMineInBox(Coordinate coordinate) {
        assert coordinate != null;
        return this.flat.isMineInBox(coordinate);
    }

    public boolean isFlagInBox(Coordinate coordinate) {
        assert coordinate != null;
        return this.flat.isFlagInBox(coordinate);
    }

    public boolean isFlagInFlat() {
        return this.flat.isFlagInFlat();
    }

    public Box getBox(Coordinate coordinate) {
        assert coordinate != null;
        return this.flat.getBox(coordinate);
    }

    public void reset() {
        this.flat.reset();
    }
}
