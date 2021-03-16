package main.java.models;

import main.java.models.flat.Flat;
import main.java.models.flat.FlatFactoryMethod;
import main.java.models.coordinate.Coordinate;

public class Board {

    private final Flat flat;

    public Board() {
        this.flat = FlatFactoryMethod.getInstance().getFlat();
    }

    public void openBox(Coordinate coordinate) {
        assert coordinate != null;
        this.flat.openBox(coordinate);
    }

    public void removerFlag(Coordinate coordinate) {
        assert coordinate != null;
        this.flat.removeFlag(coordinate);
    }

    public void putFlagInBox(Coordinate coordinate) {
        this.flat.putFlagInBox(coordinate);
    }

    public boolean isOpenBox(Coordinate coordinate) {
        return this.flat.isEmptyBox(coordinate);
    }

    public boolean isMineInBox(Coordinate coordinate) {
        return this.flat.isMineInBox(coordinate);
    }

    public boolean isFlagInBox(Coordinate coordinate) {
        return this.flat.isFlagInBox(coordinate);
    }
}
